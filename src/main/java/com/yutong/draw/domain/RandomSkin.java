package com.yutong.draw.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Data;

/**
 * 
 * @TableName random_skin
 */
@Data
public class RandomSkin extends Award implements Serializable {
    /**
     * 自增ID
     */
    private Long id;

    /**
     * 皮肤类型
     */
    private String skinName;

    /**
     * 概率
     */
    private BigDecimal probability;

    private static final long serialVersionUID = 1L;

}