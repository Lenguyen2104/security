package quanli.duan.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import quanli.duan.repository.FileStorageRepository;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = FileStorageRepository.TABLE)
public class FileStorageModel {

    @Id
    @Column
    private String fileId;
    private String fileDirectory;
    private String rawFileName;
    private String fileName;
    private String fileExtension;
}
