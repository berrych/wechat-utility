package com.github.berry.wechat.entities.meta;

/**
 * <p>
 *     事件基础消息
 * </p>
 * Created by Eugene on 2016/12/19.
 */
public class BaseEvent {

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
     * 消息类型（text/image/location/link/voice）
     */
    private String MsgType;

    /**
     * 事件类型
     */
    private long Event;

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

    public long getEvent() {
        return Event;
    }

    public void setEvent(long event) {
        Event = event;
    }
}
