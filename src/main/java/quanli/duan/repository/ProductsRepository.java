package quanli.duan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import quanli.duan.entity.ProductsModel;

@Repository
public interface ProductsRepository extends JpaRepository<ProductsModel, String> {
    String TABLE = "products";
}
