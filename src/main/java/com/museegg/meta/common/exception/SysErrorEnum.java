package com.museegg.meta.common.exception;

import lombok.Getter;

import java.text.MessageFormat;

/**
 * @author BambooBao
 * @date 2024/3/27 22:39
 * @description
 */
public enum SysErrorEnum {

    ERROR001("未知异常"),
    ERROR002("入参错误: {0}"),
    ;

    @Getter
    private String errMsg;

    SysErrorEnum(String errMsg) {
        this.errMsg = errMsg;
    }

    public String getErrorCode() {
        return this.toString();
    }

    public String getErrorMessage(Object... params) {
        return MessageFormat.format(this.getErrMsg(), params);
    }
}
