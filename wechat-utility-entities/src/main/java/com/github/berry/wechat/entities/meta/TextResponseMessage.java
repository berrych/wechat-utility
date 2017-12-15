package com.github.berry.wechat.entities.meta;

/**
 * <p>
 *     响应文本消息
 * </p>
 * Created by Eugene on 2016/12/19.
 */
public class TextResponseMessage extends BaseResponseMessage {

    /**
     * 回复消息内容
     */
    private String Content;

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }
}
