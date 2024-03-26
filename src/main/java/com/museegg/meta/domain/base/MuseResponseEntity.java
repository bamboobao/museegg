package com.museegg.meta.domain.base;

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

    private String returnCode;

    private String errorMessage;

    private T body;

    public static <T> MuseResponseEntity<T> success() {
        return new MuseResponseEntity<>("SUC000", "", null);
    }

    public static <T> MuseResponseEntity<T> success(T body) {
        return new MuseResponseEntity<>("SUC000", "", body);
    }

    public static <T> MuseResponseEntity<T> failed(String returnCode, String errorMessage) {
        return new MuseResponseEntity<>(returnCode, errorMessage, null);
    }

}
