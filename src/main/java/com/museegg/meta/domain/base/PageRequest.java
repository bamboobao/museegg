package com.museegg.meta.domain.base;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.Min;

/**
 * @author BambooBao
 * @date 2024/3/27 0:44
 * @description
 */
@Data
public class PageRequest {

    @ApiModelProperty("当前页")
    @Min(value = 1, message = "Page number must be greater than or equal to 1")
    private long current = 1;

    @ApiModelProperty("每页记录数")
    @Min(value = 1, message = "Page size must be greater than or equal to 1")
    private long size = 10;

}
