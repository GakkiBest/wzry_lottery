package com.yutong.draw.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Data;

/**
 * 
 * @author yuton
 * @TableName award
 */
@Data
public class Award implements Serializable {
    /**
     * 自增ID
     */
    private Long id;

    /**
     * 奖品名称
     */
    private String awardName;

    /**
     * 奖品中奖概率
     */
    private BigDecimal probability;

    private static final long serialVersionUID = 1L;

    //@Override
    //public String toString() {
    //    StringBuilder sb = new StringBuilder();
    //    sb.append(getClass().getSimpleName());
    //    sb.append(" [");
    //    sb.append("awardName=").append(awardName);
    //    sb.append(", probability=").append(probability);
    //    sb.append("]");
    //    return sb.toString();

}