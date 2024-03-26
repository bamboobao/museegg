package com.museegg.meta.domain.response;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author BambooBao
 * @date 2024/3/27 0:57
 * @description
 */
@Data
public class FundsPageResponse {

    @ApiModelProperty("ID")
    private String id;

    @ApiModelProperty("基金名称")
    private String fundName;

    @ApiModelProperty("本金")
    private String totalPrincipal;

    @ApiModelProperty("当前持有")
    private String totalHolding;

    @ApiModelProperty("收益率")
    private String yield;

    @ApiModelProperty("重仓基金名称")
    private String heavyFundName;

    @ApiModelProperty("重仓基金占比")
    private String heavyFundRate;

    @ApiModelProperty("重仓股票名称")
    private String heavyStockName;

    @ApiModelProperty("重仓股票占比")
    private String heavyStockRate;

    @ApiModelProperty("重仓股票本金")
    private String heavyStockPrincipal;

    @ApiModelProperty("重仓股票持有")
    private String heavyStockHolding;

}
