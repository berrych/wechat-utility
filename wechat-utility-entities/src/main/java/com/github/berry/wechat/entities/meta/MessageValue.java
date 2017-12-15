package com.github.berry.wechat.entities.meta;

/**
 * <p>
 *     消息值实体
 * </p>
 * Created by Eugene on 2016/12/24.
 */
public class MessageValue {

    /**
     * 测量值
     */
    private String value;

    /**
     * 字体颜色
     */
    private String color;

    public MessageValue() {
    }

    public MessageValue(String value, String color) {
        this.value = value;
        this.color = color;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
