package quanli.duan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import quanli.duan.entity.OrdersModel;

@Repository
public interface OrdersRepository extends JpaRepository<OrdersModel, String> {
    String TABLE = "orders";
}
