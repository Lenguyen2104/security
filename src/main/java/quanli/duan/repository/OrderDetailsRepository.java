package quanli.duan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import quanli.duan.entity.OrderDetailsModel;

@Repository
public interface OrderDetailsRepository extends JpaRepository<OrderDetailsModel, String> {
    String TABLE = "order_details";
}
