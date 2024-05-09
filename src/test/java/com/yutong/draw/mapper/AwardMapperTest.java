package com.yutong.draw.mapper;

import com.yutong.draw.domain.Award;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class AwardMapperTest {

    @Resource
    private AwardMapper awardMapper;

    @Test
    public void getAllAwardTest() {
        List<Award> allAward = awardMapper.getAllAward();
        System.out.println(allAward);
    }

    @Test
    public void getAwardNameByIdTest() {
        String awardNameById = awardMapper.getAwardNameById(1);
        System.out.println(awardNameById);
    }

    @Test
    public void getAwardByIdTest() {
        Award awardById = awardMapper.getAwardById(1);
        System.out.println(awardById);
    }
}
