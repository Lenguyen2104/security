package quanli.duan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import quanli.duan.entity.CategoriesModel;

@Repository
public interface CategoriesRepository extends JpaRepository<CategoriesModel, String> {
    String TABLE = "categories";
}
