package com.github.berry.wechat.entities.meta;

/**
 * <p>
 *     AccessToken实体，用于存放微信安全验证的access_token相关信息。
 * </p>
 * Created by Eugene on 2016/10/26.
 */
public class AccessToken {

    /**
     * 当前可用的access_token。
     */
    private String accessToken;

    /**
     * access_token有效期。
     */
    private String expires;

    public AccessToken() {
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getExpires() {
        return expires;
    }

    public void setExpires(String expires) {
        this.expires = expires;
    }
}
