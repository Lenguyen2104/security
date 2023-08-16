package quanli.duan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import quanli.duan.entity.PaymentModel;

@Repository
public interface PaymentRepository extends JpaRepository<PaymentModel, String> {
    String TABLE = "payment";
}
