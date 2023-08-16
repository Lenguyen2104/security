package quanli.duan.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import quanli.duan.repository.PaymentRepository;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = PaymentRepository.TABLE)
public class PaymentModel {

    @Id
    @Column
    private String paymentId;
    private String orderId;
    private LocalDateTime paymentDate;
    private BigDecimal paymentAmount;
}
