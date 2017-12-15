package com.github.berry.wechat.utility.test.entities;

import com.wosbb.wechat.utility.entities.WxConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Eugene on 2016/10/24.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:spring-core.xml"})
public class WxConfigTest {

    @Autowired
    private WxConfig wxConfig;

    @Test
    public void getValue() {
        String token = this.wxConfig.getToken();
        System.out.println(token);
    }
}
