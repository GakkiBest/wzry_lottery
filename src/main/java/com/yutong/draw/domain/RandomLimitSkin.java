package com.yutong.draw.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Data;

/**
 * 
 * @TableName random_limit_skin
 */
@Data
public class RandomLimitSkin extends Award implements Serializable {
    /**
     * 自增ID
     */
    private Long id;

    /**
     * 皮肤名称
     */
    private String skinName;

    /**
     * 皮肤抽取概率
     */
    private BigDecimal probability;

    private static final long serialVersionUID = 1L;

}