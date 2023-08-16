package quanli.duan.core.response;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ResponseStatus {

    SUCCESSFUL("NMU-0000", "Successful"),
    UNAUTHORIZED("NMU-0001", "Unauthorized"),
    INVALID_REQUEST_PARAMETER("NMU-0003", "Invalid request parameter: "),
    RESULT_NOT_FOUND("NMU-0008", "Result not found"),
    INTERNAL_SERVER_ERROR("NMU-9999", "Internal server error");

    private final String code;
    private final String message;

    public static final String SUCCESS = "SUCCESS";
    public static final String FAILURE = "FAILURE";
}