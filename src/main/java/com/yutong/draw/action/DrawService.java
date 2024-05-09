package com.yutong.draw.action;


public interface DrawService {

    /**
     * 单抽
     * @return  单次抽奖结果
     */
    String singleDraw();

    /**
     * 十连抽
     * @return  十次抽奖结果
     */
    String tenDraw();
}
