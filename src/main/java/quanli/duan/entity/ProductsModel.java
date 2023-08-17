package quanli.duan.entity;

import lombok.*;
import quanli.duan.repository.ProductsRepository;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = ProductsRepository.TABLE)
public class ProductsModel {

    @Id
    @Column(nullable = false)
    private String productId;
    private String productName;
    private BigDecimal unitPrice;
    private Integer quantityInStock;
    private String categoriesId;
    private String fileId;
    private String fileName;
}
