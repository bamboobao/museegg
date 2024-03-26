package com.museegg.meta.domain.base;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

/**
 * @author BambooBao
 * @date 2024/3/27 1:05
 * @description
 */
@Data
public class BaseEntity {

    /**
     * ID
     */
    @TableId
    private String id;

}
