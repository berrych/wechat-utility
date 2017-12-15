package com.github.berry.wechat.utility.test.entities;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Eugene on 2016/12/24.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:spring-core.xml"})
public class PushConfigTest {

    @Autowired
    private PushConfig pushConfig;

    @Test
    public void testGetTemlateId() {
        String measure = this.pushConfig.getMeasureConclusion();
        System.out.println(measure);
    }
}
