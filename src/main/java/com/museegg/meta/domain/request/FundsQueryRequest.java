package com.museegg.meta.domain.request;

import com.museegg.meta.domain.base.PageRequest;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author BambooBao
 * @date 2024/3/27 0:43
 * @description
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class FundsQueryRequest extends PageRequest {

    @ApiModelProperty("基金名称")
    private String fundName;

}
