package quanli.duan.entity;

import lombok.*;
import quanli.duan.repository.FileStorageRepository;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = FileStorageRepository.TABLE)
public class FileStorageModel {

    @Id
    @Column(nullable = false)
    private String fileId;
    private String fileDirectory;
    private String rawFileName;
    private String fileName;
    private String fileExtension;
}
