package com.github.berry.wechat.utility.service.impl;

import com.github.berry.kit.core.JsonKit;
import com.github.berry.kit.core.StringKit;
import com.github.berry.kit.net.HttpComponentsClientKit;
import com.github.berry.kit.net.HttpResponseKit;
import com.github.berry.wechat.entities.meta.TemplateMessage;
import com.github.berry.wechat.entities.norm.WxApiTemplate;
import com.github.berry.wechat.utility.service.PermissionThread;
import com.github.berry.wechat.utility.service.standard.IWxPushService;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by Eugene on 2016/12/24.
 */
@Service
public class WxPushService implements IWxPushService {

    /**
     * 日志操作
     */
    private Logger log = LogManager.getLogger(WxPushService.class);

    /**
     * 字符串工具箱
     */
    @Autowired
    private StringKit stringKit;

    /**
     * Json工具箱
     */
    @Autowired
    private JsonKit jsonKit;

    /**
     * Http工具箱
     */
    @Autowired
    private HttpComponentsClientKit httpComponentsClientKit;

    /**
     * Http响应工具箱
     */
    @Autowired
    private HttpResponseKit httpResponseKit;


    /**
     * 推送模板消息
     *
     * @param data 填充模板的数据
     * @return 推送结果报文
     */
    @Override
    public Map<String, String> pushTemplateMessage(String data) {
        //TODO：待实现单条模板消息推送
        return null;
    }

    /**
     * 批量推送模板消息
     *
     * @param data 填充模板的数据集
     */
    @Override
    public void batchPushTemplateMessage(String data) {
        log.info(this.stringKit.log(this.stringKit.join(new String [] {"批量推送模板消息，获取AccessToken:", PermissionThread.accessToken.getAccessToken()}), StringKit.LOG_LEVEL_INFO));
        //成功结果集
        List<Map<String, String>> results = new ArrayList<>();
        String pushUrl = this.stringKit.formart(WxApiTemplate.API_PUSH_SDK_MESSAGE_TEMPLATE_SEND, PermissionThread.accessToken.getAccessToken());
        List<TemplateMessage> datas = this.jsonKit.readAsCollection(data, List.class, TemplateMessage.class);
        for (TemplateMessage templateMessage : datas) {
            String pushData = this.jsonKit.write(templateMessage);
            HttpPost httpPost = this.httpComponentsClientKit.createHttpPost(pushUrl, pushData);
            CloseableHttpResponse response = this.httpComponentsClientKit.execute(httpPost);
            String content = this.httpResponseKit.getStringContent(response, StandardCharsets.UTF_8);
            log.info(this.stringKit.log(this.stringKit.join(new String [] {"推送模板消息:", this.jsonKit.write(templateMessage.getData())}), StringKit.LOG_LEVEL_INFO));
            log.info(this.stringKit.log(this.stringKit.join(new String [] {"推送结果:", content}), StringKit.LOG_LEVEL_INFO));

        }
    }
}
