package com.github.berry.wechat.utility.service;

import com.github.berry.kit.core.JsonKit;
import com.github.berry.kit.core.StringKit;
import com.github.berry.kit.net.HttpComponentsClientKit;
import com.github.berry.wechat.entities.meta.AccessToken;
import com.github.berry.wechat.entities.meta.Ticket;
import com.github.berry.wechat.entities.norm.WxApiTemplate;
import com.github.berry.wechat.entities.norm.WxKeys;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Map;

/**
 * <p>
 *     控制微信公众号SDK访问权限令牌刷新的专用线程。
 *     用于AccessToken、Ticket获取刷新。
 * </p>
 * Created by Eugene on 2016/10/26.
 */
public class PermissionThread implements Runnable {

    /**
     * 日志操作
     */
    private final static Logger log = LogManager.getLogger(PermissionThread.class);

    /**
     * 1秒时长，以毫秒为单位
     */
    private final static int ONE_SECOND = 1000;

    /**
     * 实时AccessToken
     */
    public static AccessToken accessToken;

    /**
     * 实时Ticket
     */
    public static Ticket ticket;

    /**
     * 开发者应用ID，微信管理平台生成
     */
    public static String appId;

    /**
     * 开发者应用密钥，微信管理平台生成。
     */
    public static String appSecret;

    @Override
    public void run() {
        while (true) {
            log.info("微信公众号SDK访问权限令牌获取刷新线程启动.......");
            //获取AccessToken
            this.fetchAccessToken();
            try {
                if(accessToken != null) {
                    log.info("成功获取微信公众号AccessToken：" + accessToken.getAccessToken());
                    //成功过去AccessToken后，立刻获取Ticket
                    this.fetchTicket();
                    if(ticket != null && ticket.getErrCode().equals("0")) {
                        log.info("成功获取微信公众号JsApiTicket：" + ticket.getTicket());
                    }
                    log.info("************************************************************************************");
                    log.info(">>>>>>>>>>>>>>>>" + 7 * ONE_SECOND + "毫秒后自动刷新AccessToken和JsApiTicket的值.....");
                    log.info("************************************************************************************");
                    Thread.sleep(7000 * ONE_SECOND);//休眠7000秒，等效大约2小时。在此时间段不会再进行微信SDK访问权限令牌获取刷新
                } else {
                    Thread.sleep(3 * ONE_SECOND);//休眠3秒
                }
            } catch (InterruptedException e) {
                log.error("微信SDK访问权限令牌获取刷新进行休眠时发生异常！", e);
                try {
                    Thread.sleep(10 * ONE_SECOND);//休眠10秒
                } catch (InterruptedException e1) {
                    log.error("微信SDK访问权限令牌获取刷新发生异常后，再次请求获取时发生异常，10秒会再次尝试！", e1);
                }
            }
        }
    }

    private void fetchAccessToken() {
        String accessTokenUrl = new StringKit().formart(WxApiTemplate.API_SDK_ACCESS_TOKEN, appId, appSecret);
        String content = new HttpComponentsClientKit().doGet(accessTokenUrl);

        if (content.contains("errcode")) {
            log.info("获取微信公众号的AccessToken失败！");
        } else {
            Map<String, Object> result = new JsonKit().readAsMap(content);
            accessToken = new AccessToken();
            accessToken.setAccessToken(String.valueOf(result.get(WxKeys.BASE_KEY_ACCESSTOKEN)));
            accessToken.setExpires(String.valueOf(result.get(WxKeys.KEY_EXPIRES)));
        }
    }

    private void fetchTicket() {
        String currentAccessToken = accessToken.getAccessToken();
        String jsApiTicketUrl = new StringKit().formart(WxApiTemplate.API_SDK_JSAPI_TICKET, currentAccessToken);
        String content = new HttpComponentsClientKit().doGet(jsApiTicketUrl);
        Map<String, Object> result = new JsonKit().readAsMap(content);
        ticket = new Ticket();
        ticket.setErrCode(String.valueOf(result.get(WxKeys.KEY_ERRCODE)));
        ticket.setErrMsg(String.valueOf(result.get(WxKeys.KEY_ERRMSG)));
        ticket.setTicket(String.valueOf(result.get(WxKeys.KEY_TICKET)));
        ticket.setExpires(String.valueOf(result.get(WxKeys.KEY_EXPIRES)));

        if (!ticket.getErrCode().equals("0")) {
            log.info("获取微信公众号JsApiTicket失败！");
        }
    }
}
