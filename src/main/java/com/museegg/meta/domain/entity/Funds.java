package com.museegg.meta.domain.entity;

import com.museegg.meta.domain.base.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author BambooBao
 * @date 2024/3/27 1:04
 * @description
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class Funds extends BaseEntity {

    /**
     * 基金名称
     */
    private String fundName;

    /**
     * 本金
     */
    private String totalPrincipal;

    /**
     * 当前持有
     */
    private String totalHolding;

    /**
     * 收益率
     */
    private String yield;

    /**
     * 重仓基金名称
     */
    private String heavyFundName;

    /**
     * 重仓基金占比
     */
    private String heavyFundRate;

    /**
     * 重仓股票名称
     */
    private String heavyStockName;

    /**
     * 重仓股票占比
     */
    private String heavyStockRate;

    /**
     * 重仓股票本金
     */
    private String heavyStockPrincipal;

    /**
     * 重仓股票持有
     */
    private String heavyStockHolding;

}
