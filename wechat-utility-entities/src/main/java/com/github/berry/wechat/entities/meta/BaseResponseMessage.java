package com.github.berry.wechat.entities.meta;

/**
 * <p>
 * 响应消息基础信息（公众号 —> 普通用户）
 * </p>
 * Created by Eugene on 2016/12/19.
 */
public class BaseResponseMessage {

    /**
     * 开发者微信账号
     */
    private String ToUserName;

    /**
     * 发送方账号（OpenId）
     */
    private String FromUserName;

    /**
     * 消息创建时间
     */
    private long CreateTime;

    /**
     * 消息类型（text/music/news）
     */
    private String MsgType;

    public String getToUserName() {
        return ToUserName;
    }

    public void setToUserName(String toUserName) {
        ToUserName = toUserName;
    }

    public String getFromUserName() {
        return FromUserName;
    }

    public void setFromUserName(String fromUserName) {
        FromUserName = fromUserName;
    }

    public long getCreateTime() {
        return CreateTime;
    }

    public void setCreateTime(long createTime) {
        CreateTime = createTime;
    }

    public String getMsgType() {
        return MsgType;
    }

    public void setMsgType(String msgType) {
        MsgType = msgType;
    }
}
