package com.github.berry.wechat.utility.entities;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 微信配置相关实体类，用于公用易变化数据储存。
 * <p>
 *     通常用于常用的微信易改动或变动的配置信息。
 *     例如：Token、AppID(应用ID)、AppSecret(应用密钥)等。
 * </p>
 * Created by Eugene on 2016/10/10.
 */
@Component
public class WxConfig {
    /**
     * 安全令牌，由微管理员在微信管理平台配置。
     */
    @Value("${token}")
    private String token;

    /**
     * 开发者应用ID，微信管理平台生成。
     */
    @Value("${appId}")
    private String appId;

    /**
     * 开发者应用密钥，微信管理平台生成。
     */
    @Value("${appSecret}")
    private String appSecret;

    public WxConfig() {
    }

    public String getToken() {
        return token;
    }

    public String getAppId() {
        return appId;
    }

    public String getAppSecret() {
        return appSecret;
    }
}
