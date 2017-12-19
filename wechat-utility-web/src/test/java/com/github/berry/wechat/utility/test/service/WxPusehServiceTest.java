package com.github.berry.wechat.utility.test.service;

import com.github.berry.kit.core.JsonKit;
import com.github.berry.wechat.entities.meta.MessageData;
import com.github.berry.wechat.entities.meta.MessageValue;
import com.github.berry.wechat.entities.meta.TemplateMessage;
import com.github.berry.wechat.utility.service.standard.IWxPushService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Eugene on 2016/12/24.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:spring-core.xml"})
public class WxPusehServiceTest {

    @Autowired
    private IWxPushService wxPushService;

    @Test
    public void testPushTemplateMessage(){
        List<TemplateMessage> datas = new ArrayList<>();
        MessageData healthData = new MessageData(new MessageValue("张三", "#173177"), new MessageValue("175cm", "#173177"), new MessageValue("84kg", "#173177"), new MessageValue("2016年8月8日 18:08", "#173177"), new MessageValue("感谢您的使用", "#173177"));
        TemplateMessage templateMessage = new TemplateMessage("oj1ZNv3CwltGiAgp8Lkj6fhQWqCk", "Frc1lIod_XrfSBC6qdD5GipAiJHgLbN8t5KQP1-Wuz0", "http://wechat.wosbb.com/oauth/health", healthData);
        datas.add(templateMessage);
        String data = new JsonKit().write(datas);

        this.wxPushService.batchPushTemplateMessage(data);
    }
}
