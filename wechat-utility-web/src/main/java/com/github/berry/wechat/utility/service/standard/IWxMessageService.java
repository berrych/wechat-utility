package com.github.berry.wechat.utility.service.standard;

import java.io.InputStream;
import java.util.Map;

/**
 * <p>
 *     微信消息事件处理业务接口定义
 * </p>
 * Created by Eugene on 2016/12/19.
 */
public interface IWxMessageService {

    /**
     * 解析微信服务器发来的请求消息
     * @param inputStream 请求消息内容流
     * @return 请求消息内容
     */
    public Map<String, Object> parseReqMessageXml(InputStream inputStream);
}
