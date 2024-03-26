package com.museegg.meta.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.museegg.meta.convert.FundsConverter;
import com.museegg.meta.domain.base.MusePage;
import com.museegg.meta.domain.entity.Funds;
import com.museegg.meta.domain.request.FundsQueryRequest;
import com.museegg.meta.domain.response.FundsPageResponse;
import com.museegg.meta.mapper.FundsMapper;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author BambooBao
 * @date 2024/3/27 0:41
 * @description
 */
@Service
public class FundsService {

    @Autowired
    private FundsMapper fundsMapper;


    public MusePage<FundsPageResponse> page(FundsQueryRequest request) {
        IPage<Funds> iPage = new Page<>(request.getCurrent(), request.getSize());
        iPage = fundsMapper.selectPage(iPage, Wrappers.<Funds>lambdaQuery()
                .like(!StringUtils.isEmpty(request.getFundName()), Funds::getFundName, request.getFundName()));

        return FundsConverter.INSTANCE.toPageResponse(new MusePage<>(iPage));
    }
}
