package quanli.duan.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import quanli.duan.dto.request.RegisterRequest;
import quanli.duan.dto.request.UserRequest;
import quanli.duan.repository.UserRepository;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = UserRepository.TABLE)
public class UserModel {

    @Id
    @Column()
    private String userId;
    private String firstName;
    private String lastName;
    private String password;
    private String email;
    private String phoneNumber;
    private String address;
    private String city;
    private String state;
    private String zipCode;
    private String userRoleId;

    public static UserModel of(RegisterRequest registerRequest, PasswordEncoder passwordEncoder,
                               String userRoleId) {
        return UserModel.builder()
                .userId(UUID.randomUUID().toString().replaceAll("-",""))
                .firstName(registerRequest.getFirstName())
                .lastName(registerRequest.getLastName())
                .password(passwordEncoder.encode(registerRequest.getPassword()))
                .email(registerRequest.getEmail())
                .phoneNumber(registerRequest.getPhoneNumber())
                .address(registerRequest.getAddress())
                .city(registerRequest.getCity())
                .zipCode(registerRequest.getZipCode())
                .userRoleId(userRoleId)
                .build();
    }
}
