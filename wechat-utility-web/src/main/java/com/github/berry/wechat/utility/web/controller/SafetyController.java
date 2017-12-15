package com.github.berry.wechat.utility.web.controller;

import com.github.berry.kit.core.CodecKit;
import com.github.berry.kit.core.StringKit;
import com.github.berry.wechat.entities.meta.AccessToken;
import com.github.berry.wechat.entities.meta.Ticket;
import com.github.berry.wechat.entities.norm.WxKeys;
import com.github.berry.wechat.utility.entities.WxConfig;
import com.github.berry.wechat.utility.service.PermissionThread;
import com.github.berry.wechat.utility.service.WxUtil;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

/**
 * <p>
 *     微信安装验证请求处理的控制器
 * </p>
 * Created by Eugene on 2016/10/24.
 */
@Controller
@Scope("prototype")
@RequestMapping("/safety")
public class SafetyController {
    /**
     * 日志操作
     */
    private final static Logger log = LogManager.getLogger(SafetyController.class);

    /**
     * 字符串工具箱
     */
    @Autowired
    private StringKit stringKit;

    /**
     * 安全工具箱
     */
    @Autowired
    private CodecKit codecKit;

    /**
     * 微信公共配置信息实体
     */
    @Autowired
    private WxConfig wxConfig;

    /**
     * 微信服务器接入验证
     *
     * @param request  HttpRequest请求对象
     * @param response HttpResponse响应对象
     */
    @RequestMapping(value = "/verify")
    public void verify(HttpServletRequest request, HttpServletResponse response) {
        //微信加密签名，signature结合了开发者填写的token参数和请求中的timestamp参数、nonce参数。
        String signature = request.getParameter(WxKeys.BASE_KEY_SIGNATURE);
        //时间戳
        String timestamp = request.getParameter(WxKeys.BASE_KEY_TIMESTAMP);
        //随机数
        String nonce = request.getParameter(WxKeys.BASE_KEY_NONCE);
        //随机字符串
        String echostr = request.getParameter(WxKeys.BASE_KEY_ECHOSTR);
        //获取微信的Token值
        String token = this.wxConfig.getToken();

        //将token、timestamp、nonce三个参数进行字典序排序
        String[] parmams = new String[]{token, timestamp, nonce};
        Arrays.sort(parmams);

        String source = this.stringKit.join(parmams);
        //对排序字典进行SHA-1加密
        String encryptedStr = this.codecKit.hex(source, CodecKit.ALGORITHMS_SHA1);
        //SHA-1加密后的排序字典与signature对比
        boolean isSame = encryptedStr != null ? encryptedStr.equals(signature.toUpperCase()) : false;
        PrintWriter writer = null;
        try {
            writer = response.getWriter();
            if (isSame) {
                writer.print(echostr);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            writer.close();
        }
    }

    /**
     * 获取AccessToken
     *
     * @return AccessToken零时票据
     */
    @RequestMapping(value = "/fetch/accesstoken")
    @ResponseBody
    public AccessToken fetchAccessToken() {
        return PermissionThread.accessToken;
    }

    /**
     * 获取JSAPI的零时票据
     *
     * @return JsApiTicket零时票据
     */
    @RequestMapping(value = "/fetch/ticket")
    @ResponseBody
    public Ticket fetchTicket(HttpServletRequest request) {
        String url = request.getParameter("url");
        Ticket ticket = PermissionThread.ticket;

        if (ticket != null) {
            ticket.setAppId(PermissionThread.appId);
            String timestamp = WxUtil.createTimestamp();
            String noncestr = WxUtil.createNonceStr();
            ticket.setTimestamp(timestamp);
            ticket.setNoncestr(noncestr);

            String[] parmams = new String[]{"jsapi_ticket=", ticket.getTicket(), "&noncestr=", noncestr, "&timestamp=", timestamp, "&url=", url};
            String source = this.stringKit.join(parmams);

            //对排序字典进行SHA-1加密
            String signature = this.codecKit.hex(source, CodecKit.ALGORITHMS_SHA1);
            ticket.setSignature(signature);
        }

        return PermissionThread.ticket;
    }
}
