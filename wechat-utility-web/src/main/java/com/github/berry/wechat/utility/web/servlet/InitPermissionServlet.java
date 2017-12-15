package com.github.berry.wechat.utility.web.servlet;

import com.github.berry.wechat.entities.norm.WxKeys;
import com.github.berry.wechat.utility.service.PermissionThread;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

/**
 * <p>
 *     初始化微信公众号SDK访问权限令牌刷新的Servlet。
 *     应用服务器启动时，初始化AccessToken、Ticket获取刷新。
 * </p>
 * Created by Eugene on 2016/10/26.
 */
public class InitPermissionServlet extends HttpServlet {
    @Override
    public void init() throws ServletException {
        super.init();
        PermissionThread.appId = super.getInitParameter(WxKeys.BASE_KEY_APPID);
        PermissionThread.appSecret = super.getInitParameter(WxKeys.BASE_KEY_APPSECRET);
        new Thread(new PermissionThread()).start();
    }
}
