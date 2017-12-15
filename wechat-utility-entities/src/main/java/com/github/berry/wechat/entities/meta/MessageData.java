package com.github.berry.wechat.entities.meta;

/**
 * <p>
 *     消息数据实体
 * </p>
 * Created by Eugene on 2016/12/24.
 */
public class MessageData {

    /**
     *  推送消息值
     */
    private MessageValue keyword1;
    /**
     *  推送消息值
     */
    private MessageValue keyword2;

    /**
     *  推送消息值
     */
    private MessageValue keyword3;
    /**
     *  推送消息值
     */
    private MessageValue keyword4;

    /**
     *  推送消息值
     */
    private MessageValue remark;


    public MessageData() {
    }

    public MessageData(MessageValue keyword1, MessageValue keyword2, MessageValue keyword3, MessageValue keyword4, MessageValue remark) {
        this.keyword1 = keyword1;
        this.keyword2 = keyword2;
        this.keyword3 = keyword3;
        this.keyword4 = keyword4;
        this.remark = remark;
    }

    public MessageValue getKeyword1() {
        return keyword1;
    }

    public void setKeyword1(MessageValue keyword1) {
        this.keyword1 = keyword1;
    }

    public MessageValue getKeyword2() {
        return keyword2;
    }

    public void setKeyword2(MessageValue keyword2) {
        this.keyword2 = keyword2;
    }

    public MessageValue getKeyword3() {
        return keyword3;
    }

    public void setKeyword3(MessageValue keyword3) {
        this.keyword3 = keyword3;
    }

    public MessageValue getKeyword4() {
        return keyword4;
    }

    public void setKeyword4(MessageValue keyword4) {
        this.keyword4 = keyword4;
    }

    public MessageValue getRemark() {
        return remark;
    }

    public void setRemark(MessageValue remark) {
        this.remark = remark;
    }
}
