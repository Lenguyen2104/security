package quanli.duan.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import quanli.duan.repository.OrderDetailsRepository;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = OrderDetailsRepository.TABLE)
public class OrderDetailsModel {

    @Id
    @Column
    private String orderDetailId;
    private String orderId;
    private String productId;
    private String categoryId;
    private int quantity;
    private BigDecimal unitPrice;
}
