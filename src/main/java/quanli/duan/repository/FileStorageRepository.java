package quanli.duan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import quanli.duan.entity.FileStorageModel;

@Repository
public interface FileStorageRepository extends JpaRepository<FileStorageModel, String> {
    String TABLE = "file_storage";
}
