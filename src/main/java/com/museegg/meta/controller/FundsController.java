package com.museegg.meta.controller;

import com.museegg.meta.domain.base.MuseResponseEntity;
import com.museegg.meta.domain.base.PageResponse;
import com.museegg.meta.domain.request.FundsQueryRequest;
import com.museegg.meta.domain.response.FundsPageResponse;
import com.museegg.meta.service.FundsService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author BambooBao
 * @date 2024/3/27 0:02
 * @description
 */
@RestController
@RequestMapping("/funds")
@Api(tags = "基金相关")
public class FundsController {

    @Autowired
    private FundsService fundsService;

    @PostMapping("/page")
    @ApiOperation(value = "基金分页查询", notes = "当初统计的基金的占比数据")
    public MuseResponseEntity<PageResponse<FundsPageResponse>> page(@RequestBody @Validated FundsQueryRequest request) {
        PageResponse<FundsPageResponse> page = fundsService.page(request);
        return MuseResponseEntity.success(page);
    }

}
