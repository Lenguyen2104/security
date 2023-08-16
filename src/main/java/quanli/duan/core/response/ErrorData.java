package quanli.duan.core.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ErrorData {

    private String code;
    private String msg;

    @JsonProperty("invalid_fields")
    private Object invalidFields;

    private Object error;
    private String cause;
    private String timestamp;
}
