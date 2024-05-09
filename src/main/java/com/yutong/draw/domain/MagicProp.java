package com.yutong.draw.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Data;

/**
 * 
 * @TableName magic_prop
 */
@Data
public class MagicProp extends Award implements Serializable {
    /**
     * 自增ID
     */
    private Long id;

    /**
     * 魔力值道具名称
     */
    private String propName;

    /**
     * 概率
     */
    private BigDecimal probability;

    private static final long serialVersionUID = 1L;

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        MagicProp other = (MagicProp) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getPropName() == null ? other.getPropName() == null : this.getPropName().equals(other.getPropName()))
            && (this.getProbability() == null ? other.getProbability() == null : this.getProbability().equals(other.getProbability()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getPropName() == null) ? 0 : getPropName().hashCode());
        result = prime * result + ((getProbability() == null) ? 0 : getProbability().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", propName=").append(propName);
        sb.append(", probability=").append(probability);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}