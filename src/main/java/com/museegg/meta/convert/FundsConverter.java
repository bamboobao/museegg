package com.museegg.meta.convert;

import com.museegg.meta.domain.base.MusePage;
import com.museegg.meta.domain.entity.Funds;
import com.museegg.meta.domain.response.FundsPageResponse;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @author BambooBao
 * @date 2024/3/27 1:52
 * @description
 */
@Mapper
public interface FundsConverter {

    FundsConverter INSTANCE = Mappers.getMapper(FundsConverter.class);

    MusePage<FundsPageResponse> toPageResponse(MusePage<Funds> musePage);
}
