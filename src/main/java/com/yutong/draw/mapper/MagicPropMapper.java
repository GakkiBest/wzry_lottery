package com.yutong.draw.mapper;

import com.yutong.draw.domain.MagicProp;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
* @author yuton
* @description 针对表【magic_prop】的数据库操作Mapper
* @createDate 2024-05-07 18:22:34
* @Entity generator.domain.MagicProp
*/
@Mapper
public interface MagicPropMapper {

    /**
     * 通过id查询道具名称
     * @param id
     * @return
     */
    String getMagicPropNameById(long id);


    /**
     * 获取所有道具
     */
    List<MagicProp> getAllMagicProps();
}




