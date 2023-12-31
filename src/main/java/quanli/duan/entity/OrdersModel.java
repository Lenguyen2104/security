package quanli.duan.entity;

import lombok.*;
import quanli.duan.repository.OrdersRepository;
import quanli.duan.repository.ProductsRepository;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = OrdersRepository.TABLE)
public class OrdersModel {

    @Id
    @Column(nullable = false)
    private String orderId;
    private String customerId;
    private LocalDateTime orderDate;
    private BigDecimal totalAmount;
    private String status;
    private String shippingAddress;
    private String paymentMethod;
    private String shippingMethod;
}
