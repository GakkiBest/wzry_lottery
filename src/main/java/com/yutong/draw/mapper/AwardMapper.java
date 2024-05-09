package com.yutong.draw.mapper;

import com.yutong.draw.domain.Award;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author yuton
 * @description 针对表【award】的数据库操作Mapper
 * @createDate 2024-05-07 18:22:34 @Entity generator.domain.Award
 */
@Mapper
public interface AwardMapper {

  /**
   * 通过awardId获取awardName
   *
   * @param awardId 奖品ID
   * @return 奖品名称
   */
  String getAwardNameById(long awardId);

  /**
   * 获取所有奖品
   * @return
   */
  List<Award> getAllAward();


  /**
   * 通过awardId获取award
   * @param awardId
   * @return
   */
  Award getAwardById(long awardId);

  /**
   * 通过awardName获取awardId
   * @param awardName
   * @return
   */
  Long getAwardIdByAwardName(String awardName);
}
