package com.yutong.draw.mapper;

import com.yutong.draw.domain.RandomSkin;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

/**
* @author yuton
* @description 针对表【random_skin】的数据库操作Mapper
* @createDate 2024-05-07 18:22:34
* @Entity generator.domain.RandomSkin
*/

@Mapper
public interface RandomSkinMapper {
    /**
     * 根据id获取随机皮肤
     * @param id
     * @return
     */
    String getRandomSkinById(long id);


    /**
     * 获取所有随机皮肤
     */
    List<RandomSkin> getAllRandomSkins();
}




