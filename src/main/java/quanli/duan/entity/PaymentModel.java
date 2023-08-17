package quanli.duan.entity;

import lombok.*;
import quanli.duan.repository.PaymentRepository;

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
@Entity(name = PaymentRepository.TABLE)
public class PaymentModel {

    @Id
    @Column(nullable = false)
    private String paymentId;
    private String orderId;
    private LocalDateTime paymentDate;
    private BigDecimal paymentAmount;
}
