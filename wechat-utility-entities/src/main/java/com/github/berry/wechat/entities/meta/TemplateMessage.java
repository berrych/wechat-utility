package com.github.berry.wechat.entities.meta;

/**
 * <p>
 *     模板消息消息实体
 * </p>
 * Created by Eugene on 2016/12/24.
 */
public class TemplateMessage {

    /**
     * 消息接收者id
     */
    private String touser;

    /**
     * 消息模板id
     */
    private String templateId;

    /**
     * 消息跳转地址
     */
    private String url;

    /**
     * 填充小时模板数据
     */
    private MessageData data;

    public TemplateMessage() {
    }

    public TemplateMessage(String touser, String templateId, String url, MessageData data) {
        this.touser = touser;
        this.templateId = templateId;
        this.url = url;
        this.data = data;
    }

    public String getTouser() {
        return touser;
    }

    public void setTouser(String touser) {
        this.touser = touser;
    }

    public String gettemplateId() {
        return templateId;
    }

    public void settemplateId(String templateId) {
        this.templateId = templateId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public MessageData getData() {
        return data;
    }

    public void setData(MessageData data) {
        this.data = data;
    }
}
