package quanli.duan.entity;

import lombok.*;
import quanli.duan.repository.CategoriesRepository;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = CategoriesRepository.TABLE)
public class CategoriesModel {

    @Id
    @Column(nullable = false)
    private String categoriesId;
    private String categoryName;
    private String fileId;
    private String fileName;
}
