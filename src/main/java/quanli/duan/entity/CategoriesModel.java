package quanli.duan.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import quanli.duan.repository.CategoriesRepository;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = CategoriesRepository.TABLE)
public class CategoriesModel {

    @Id
    @Column
    private String categoriesId;
    private String categoryName;
    private String fileId;
    private String fileName;
}
