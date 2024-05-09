package com.yutong.draw;

import com.yutong.draw.mapper.AwardMapper;
import java.math.BigDecimal;
import java.security.SecureRandom;
import java.text.DecimalFormat;
import javax.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DrawApplicationTests {

    @Resource
    private AwardMapper awardMapper;

    @Test
    void contextLoads() {
        // 测试随机数
        for (int i = 0; i < 500; i++) {
            double value = new SecureRandom().nextDouble();
            DecimalFormat df = new DecimalFormat("#.####");
            String formatValue = df.format(value);
            BigDecimal random = new BigDecimal(formatValue);
            System.out.println(random);
        }
    }

}
