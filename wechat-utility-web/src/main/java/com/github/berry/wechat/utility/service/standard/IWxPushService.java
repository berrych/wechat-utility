package com.github.berry.wechat.utility.service.standard;

import java.util.Map;

/**
 * <p>
 *     推送业务接口定义
 * </p>
 * Created by Eugene on 2016/12/24.
 */
public interface IWxPushService {

    /**
     * 推送模板消息
     *
     * @param data 填充模板的数据
     * @return 推送结果报文
     */
    public Map<String, String> pushTemplateMessage(String data);

    /**
     * 批量推送模板消息
     *
     * @param data 填充模板的数据集
     */
    public void batchPushTemplateMessage(String data);


}
