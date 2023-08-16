package quanli.duan.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import quanli.duan.repository.ProductsRepository;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = ProductsRepository.TABLE)
public class ProductsModel {

    @Id
    @Column
    private String productId;
    private String productName;
    private BigDecimal unitPrice;
    private Integer quantityInStock;
    private String categoriesId;
    private String fileId;
    private String fileName;
}
