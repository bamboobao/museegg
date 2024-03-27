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
    @Min(value = 1, message = "当前页码必须大于1")
    private long current = 1;

    @ApiModelProperty("每页记录数")
    @Min(value = 1, message = "每页页数必须大于1")
    private long size = 10;

}
