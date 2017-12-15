package com.github.berry.wechat.entities.meta;

/**
 * <p>
 * 扫描带参数的二维码消息事件
 * </p>
 * Created by Eugene on 2016/12/19.
 */
public class QrCodeEvent extends BaseEvent {

    /**
     * 事件Key值
     */
    private String EventKey;

    /**
     * 二维码的ticket，用于换取二维码图片
     */
    private String Ticket;

    public String getEventKey() {
        return EventKey;
    }

    public void setEventKey(String eventKey) {
        EventKey = eventKey;
    }

    public String getTicket() {
        return Ticket;
    }

    public void setTicket(String ticket) {
        Ticket = ticket;
    }
}
