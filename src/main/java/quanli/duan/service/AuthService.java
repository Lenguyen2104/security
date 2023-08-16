package quanli.duan.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import quanli.duan.core.response.ResponseBody;
import quanli.duan.dto.request.LoginRequest;
import quanli.duan.dto.request.RegisterRequest;
import quanli.duan.entity.UserModel;
import quanli.duan.repository.UserRepository;
import quanli.duan.repository.UserRoleRepository;

import static quanli.duan.core.response.ResponseStatus.SUCCESS;

@Slf4j
@Service
//@RequiredArgsConstructor
public class AuthService {
    private UserRepository userRepository;
    private UserRoleRepository userRoleRepository;
    private PasswordEncoder passwordEncoder;
    private AuthenticationManager authenticationManager;

    @Autowired
    public AuthService(UserRepository userRepository, UserRoleRepository userRoleRepository, PasswordEncoder passwordEncoder,
                       AuthenticationManager authenticationManager) {
        this.userRepository = userRepository;
        this.userRoleRepository = userRoleRepository;
        this.passwordEncoder = passwordEncoder;
        this.authenticationManager = authenticationManager;
    }

//    @Autowired
//    public void AuthController(AuthenticationManager authenticationManager) {
//        this.authenticationManager = authenticationManager;
//    }

    public ResponseBody<Object> register(RegisterRequest registerRequest) {
        var response = new ResponseBody<>();
        if (userRepository.existsByEmail(registerRequest.getEmail())) {
            response.setOperationSuccess(SUCCESS, "fail");
        }
        var userRoleModel = userRoleRepository.findByUserNameRole(registerRequest.getUserNameRole());
        UserModel userModel = UserModel.of(registerRequest, passwordEncoder, userRoleModel.getUserRoleId());
        userRepository.save(userModel);
        response.setOperationSuccess(SUCCESS, "success");
        return response;
    }

    public ResponseBody<Object> login(LoginRequest loginRequest) {
        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(loginRequest.getEmail(),
                        loginRequest.getPassword()));
        SecurityContextHolder.getContext().setAuthentication(authentication);

        var response = new ResponseBody<>();
        response.setOperationSuccess(SUCCESS, "success");
        return response;
    }
}
