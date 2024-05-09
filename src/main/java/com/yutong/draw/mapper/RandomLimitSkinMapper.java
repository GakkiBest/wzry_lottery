package com.yutong.draw.mapper;

import com.yutong.draw.domain.RandomLimitSkin;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
* @author yuton
* @description 针对表【random_limit_skin】的数据库操作Mapper
* @createDate 2024-05-07 18:22:34
* @Entity generator.domain.RandomLimitSkin
*/

@Mapper
public interface RandomLimitSkinMapper {

    /**
     * 根据id获取随机限时皮肤
     * @param id
     * @return
     */
    String getRandomLimitSkinById(long id);


    /**
     * 获取所有随机限时皮肤
     */
    List<RandomLimitSkin> getAllRandomLimitSkins();


    /**
     * 根据皮肤名获取皮肤ID
     */
    Long getSkinIdByName(String skinName);
}




