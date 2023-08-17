package quanli.duan.entity;

import lombok.*;
import quanli.duan.repository.OrderDetailsRepository;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = OrderDetailsRepository.TABLE)
public class OrderDetailsModel {

    @Id
    @Column(nullable = false)
    private String orderDetailId;
    private String orderId;
    private String productId;
    private String categoryId;
    private int quantity;
    private BigDecimal unitPrice;
}
