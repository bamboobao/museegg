package com.museegg.meta.config;

import com.museegg.meta.common.exception.SysErrorEnum;
import com.museegg.meta.domain.base.MuseResponseEntity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.List;

/**
 * @author BambooBao
 * @date 2024/3/27 19:25
 * @description
 */
@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    /**
     * 入参错误信息简化
     */
    @ResponseBody
    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public MuseResponseEntity<Object> handleValidationExceptions(MethodArgumentNotValidException ex) {
        BindingResult bindingResult = ex.getBindingResult();
        List<FieldError> fieldErrors = bindingResult.getFieldErrors();

        StringBuilder errorMessages = new StringBuilder();
        for (FieldError fieldError : fieldErrors) {
            errorMessages.append(fieldError.getField()).append(": ").append(fieldError.getDefaultMessage()).append("; ");
        }

        String errMsg = errorMessages.toString().trim();
        log.error("入参错误: {}", errMsg);
        return MuseResponseEntity.failed(SysErrorEnum.ERROR002, errMsg);
    }

    /**
     * 未知异常
     */
    @ResponseBody
    @ExceptionHandler(value = Exception.class)
    public MuseResponseEntity<Object> handleException(Exception ex) {
        log.error(ex.getLocalizedMessage());
        return MuseResponseEntity.failed(SysErrorEnum.ERROR001);
    }

}
