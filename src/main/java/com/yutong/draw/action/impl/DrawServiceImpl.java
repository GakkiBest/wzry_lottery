package com.yutong.draw.action.impl;

import com.yutong.draw.action.DrawService;
import com.yutong.draw.common.Constant;
import com.yutong.draw.domain.Award;
import com.yutong.draw.domain.MagicProp;
import com.yutong.draw.domain.RandomLimitSkin;
import com.yutong.draw.domain.RandomSkin;
import com.yutong.draw.mapper.AwardMapper;
import com.yutong.draw.mapper.MagicPropMapper;
import com.yutong.draw.mapper.RandomLimitSkinMapper;
import com.yutong.draw.mapper.RandomSkinMapper;
import java.math.BigDecimal;
import java.security.SecureRandom;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/**
 * 抽奖接口实现类
 * @author yuton
 */
@Service
public class DrawServiceImpl implements DrawService {

    @Resource
    private AwardMapper awardMapper;
    
    @Resource
    private RandomLimitSkinMapper randomLimitSkinMapper;

    @Resource
    private RandomSkinMapper randomSkinMapper;

    @Resource
    private MagicPropMapper magicPropMapper;

    @Override
    public String singleDraw() {

        /**
         * 所有奖品列表
         */
        List<Award> awardList = awardMapper.getAllAward();

        //随机数
        BigDecimal randomValue = getSecurityRandomForFour();

        BigDecimal currentCursor = new BigDecimal("0.0000");
        for (Award award : awardList) {
            if (randomValue.compareTo(currentCursor.add(award.getProbability())) <= 0) {
                String awardName = award.getAwardName();
                Long awardId = awardMapper.getAwardIdByAwardName(awardName);
                if (awardId.equals(Constant.RandomLimitSkinID)) {
                    return getRandomLimitSkin();
                } else if (awardId.equals(Constant.RandomSkinID)) {
                    return getRandomSkin();
                } else if (awardId.equals(Constant.MAGICPROPID)) {
                    return getMagicProp();
                }
                return awardName;
            }
            currentCursor = currentCursor.add(award.getProbability());
        }
        return "" ;
    }

    @Override
    public String tenDraw() {

        /**
         *  存储每次抽奖结果
         */
        List<String> result = new ArrayList<>();

        for (int i = 0; i < Constant.DRAW_QUANTITY; i++) {
            result.add(singleDraw());
        }

        StringBuilder resultString = new StringBuilder();
        for (String s : result) {
            resultString.append(s).append("\n");
        }
        return resultString.toString();

    }


    /**
     * 随机获取一个限定皮肤
     * @return
     */
    private String getRandomLimitSkin() {
        // 获取所有限定皮肤
        List<RandomLimitSkin> limitSkinList = randomLimitSkinMapper.getAllRandomLimitSkins();

        // 获取随机幸运值
        BigDecimal randomValue = getSecurityRandomForTwo();

        BigDecimal currentCursor = new BigDecimal("0.00");
        for (RandomLimitSkin randomLimitSkin : limitSkinList) {

            if (randomValue.compareTo(currentCursor.add(randomLimitSkin.getProbability())) <= 0) {
                return randomLimitSkin.getSkinName();
            }
            currentCursor = currentCursor.add(randomLimitSkin.getProbability());
        }
        return "";
    }

    /**
     * 随机获取一个皮肤
     * @return
     */
    private String getRandomSkin() {
        //获取所有皮肤
        List<RandomSkin> skinList = randomSkinMapper.getAllRandomSkins();

        //获取随机幸运值
        BigDecimal randomValue = getSecurityRandomForTwo();

        BigDecimal currentCursor = new BigDecimal("0.00");
        for (RandomSkin randomSkin : skinList) {

            if (randomValue.compareTo(currentCursor.add(randomSkin.getProbability())) <= 0) {
                return randomSkin.getSkinName();
            }
            currentCursor = currentCursor.add(randomSkin.getProbability());
        }
        return "";
    }

    /**
     * 随机获取一个魔力值道具
     * @return
     */
    private String getMagicProp() {
        // 获取所有魔力值道具
        List<MagicProp> magicPropsList = magicPropMapper.getAllMagicProps();

        // 获取随机幸运值
        BigDecimal randomValue = getSecurityRandomForFour();

        BigDecimal currentCursor = new BigDecimal("0.0000");
        for (int i = 0; i < magicPropsList.size(); i++){

            if (randomValue.compareTo(currentCursor.add(magicPropsList.get(i).getProbability())) <= 0) {
                return magicPropsList.get(i).getPropName();
            }
            currentCursor = currentCursor.add(magicPropsList.get(i).getProbability());
        }
        return "";
    }


    private BigDecimal getSecurityRandomForFour() {
        double value = new SecureRandom().nextDouble();
        DecimalFormat df = new DecimalFormat("#.####");
        String formatValue = df.format(value);
        return new BigDecimal(formatValue);
    }

    private BigDecimal getSecurityRandomForTwo() {
        double value = new SecureRandom().nextDouble();
        DecimalFormat df = new DecimalFormat("#.##");
        String formatValue = df.format(value);
        return new BigDecimal(formatValue);
    }
}
