package com.github.berry.wechat.entities.meta;

/**
 * JS接口的临时票据实体
 * Created by Eugene on 2016/11/8.
 */
public class Ticket {

    /**
     * 错误码
     */
    private String errCode;

    /**
     * 错误消息
     */
    private String errMsg;

    /**
     * 调用jsApi的Ticket。
     */
    private String ticket;

    /**
     * 调用jsApi的Ticket的有效期。
     */
    private String expires;

    /**
     * 开发者应用ID，微信管理平台生成。
     */
    private String appId;

    /**
     * 签名的随机串
     */
    private String noncestr;

    /**
     * 签名时间戳
     */
    private String timestamp;

    /**
     * 签名
     */
    private String signature;

    public Ticket() {
    }

    public String getErrCode() {
        return errCode;
    }

    public void setErrCode(String errCode) {
        this.errCode = errCode;
    }

    public String getErrMsg() {
        return errMsg;
    }

    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
    }

    public String getTicket() {
        return ticket;
    }

    public void setTicket(String ticket) {
        this.ticket = ticket;
    }

    public String getExpires() {
        return expires;
    }

    public void setExpires(String expires) {
        this.expires = expires;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getNoncestr() {
        return noncestr;
    }

    public void setNoncestr(String noncestr) {
        this.noncestr = noncestr;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }
}
