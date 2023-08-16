package quanli.duan.entity;

import lombok.*;
import org.hibernate.Hibernate;
import quanli.duan.repository.UserRoleRepository;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = UserRoleRepository.TABLE)
public class UserRoleModel {
    @Id
    @Column
    private String userRoleId;
    private String userNameRole;
}
