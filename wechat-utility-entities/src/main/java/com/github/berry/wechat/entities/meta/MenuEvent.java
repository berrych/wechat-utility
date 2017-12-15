package com.github.berry.wechat.entities.meta;

/**
 * <p>
 *     自定时间消息事件
 * </p>
 * Created by Eugene on 2016/12/19.
 */
public class MenuEvent extends BaseEvent {

    /**
     * 事件Key，与自定义菜单接口中的Key值对应
     */
    private String EventKey;

    public String getEventKey() {
        return EventKey;
    }

    public void setEventKey(String eventKey) {
        EventKey = eventKey;
    }
}
