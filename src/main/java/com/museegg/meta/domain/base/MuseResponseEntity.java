package com.museegg.meta.domain.base;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author BambooBao
 * @date 2024/3/27 0:08
 * @description
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MuseResponseEntity<T> {

    @ApiModelProperty("返回码")
    private String returnCode;

    @ApiModelProperty("错误信息")
    private String errorMessage;

    @ApiModelProperty("响应体")
    private T body;

    public static <T> MuseResponseEntity<T> success() {
        return new MuseResponseEntity<>("SUC000", null, null);
    }

    public static <T> MuseResponseEntity<T> success(T body) {
        return new MuseResponseEntity<>("SUC000", null, body);
    }

    public static <T> MuseResponseEntity<T> failed(String returnCode, String errorMessage) {
        return new MuseResponseEntity<>(returnCode, errorMessage, null);
    }

}
