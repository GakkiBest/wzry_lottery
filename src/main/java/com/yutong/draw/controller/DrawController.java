package com.yutong.draw.controller;

import com.yutong.draw.action.DrawService;
import javax.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/draw")
public class DrawController {

    @Resource
    private DrawService drawService;

    /**
     * 单次抽奖
     * @return 单次抽奖结果
     */
    @GetMapping("/single")
    public String singleDraw() {
        return drawService.singleDraw();
    }

    @GetMapping("/ten")
    public String tenDraw() {
        return drawService.tenDraw();
    }

}
