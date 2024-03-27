package com.museegg.meta.domain.base;

import com.baomidou.mybatisplus.core.metadata.IPage;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author BambooBao
 * @date 2024/3/27 0:27
 * @description
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PageResponse<T> {

    @ApiModelProperty("当前页")
    private long current;

    @ApiModelProperty("每页记录数")
    private long size;

    @ApiModelProperty("总页数")
    private long pages;

    @ApiModelProperty("总记录数")
    private long total;

    @ApiModelProperty("数据列表")
    private List<T> records;

    public PageResponse(IPage<T> iPage) {
        this.current = iPage.getCurrent();
        this.size = iPage.getSize();
        this.pages = iPage.getPages();
        this.total = iPage.getTotal();
        this.records = iPage.getRecords();
    }

    public PageResponse(List<T> records) {
        this.current = 1;
        this.size = records.size();
        this.pages = 1;
        this.total = records.size();
        this.records = records;
    }

}
