package com.github.berry.wechat.utility.service.impl;

import com.github.berry.kit.core.JsonKit;
import com.github.berry.kit.core.StringKit;
import com.github.berry.kit.net.HttpComponentsClientKit;
import com.github.berry.wechat.entities.norm.WxApiTemplate;
import com.github.berry.wechat.utility.service.PermissionThread;
import com.github.berry.wechat.utility.service.standard.IWxUserManagerService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * <p>
 *     微信公众号关注用户管理业务实现。
 * </p>
 * Created by Eugene on 2016/12/17.
 */
@Service
public class WxUserManagerService implements IWxUserManagerService {
    /**
     * 日志操作
     */
    private final Logger log = LogManager.getLogger(WxUserManagerService.class);

    @Autowired
    private StringKit stringKit;

    @Autowired
    private JsonKit jsonKit;

    @Autowired
    private HttpComponentsClientKit httpComponentsClientKit;

    /**
     * 获取全部关注者列表，一次拉取调用最多拉取10000个关注者的OpenID，可以通过多次拉取的方式来满足需求。
     * 关注者列表已返回完时，返回next_openid为空。
     *
     * @return 关注者列表报文
     */
    @Override
    public Map<String, Object> fetchUsers() {
        String accessToken = PermissionThread.accessToken.getAccessToken();
        String url = this.stringKit.formart(WxApiTemplate.API_USER_SDK_GET_ALL, accessToken);
        if (log.isDebugEnabled()) {
            log.debug(this.stringKit.log(this.stringKit.join(new String [] {"获取关注者列表的URL：", url}), StringKit.LOG_LEVEL_DEBUG));
        }
        String jsonStr = this.httpComponentsClientKit.doGet(url);
        if (log.isDebugEnabled()) {
            log.debug(this.stringKit.log(this.stringKit.join(new String [] {"关注者列表JSON数据：", jsonStr}), StringKit.LOG_LEVEL_DEBUG));
        }
        return this.jsonKit.readAsMap(jsonStr);
    }

    /**
     * 获取关注者列表，从指定的nextOpenId开始获取（不包括nextOpenId）。
     * 关注者列表已返回完时，返回next_openid为空。
     *
     * @param nextOpenId 本次获取列表的开始OpenId
     * @return 关注者列表报文
     */
    @Override
    public Map<String, Object> fetchUsers(String nextOpenId) {
        String accessToken = PermissionThread.accessToken.getAccessToken();
        String url = this.stringKit.formart(WxApiTemplate.API_USER_SDK_GET_OFFSET, accessToken, nextOpenId);
        if (log.isDebugEnabled()) {
            log.debug(this.stringKit.log(this.stringKit.join(new String [] {"获取关注者列表的URL：", url}), StringKit.LOG_LEVEL_DEBUG));
        }
        String jsonStr = this.httpComponentsClientKit.doGet(url);
        if (log.isDebugEnabled()) {
            log.debug(this.stringKit.log(this.stringKit.join(new String [] {"关注者列表JSON数据：", jsonStr}), StringKit.LOG_LEVEL_DEBUG));
        }
        return this.jsonKit.readAsMap(jsonStr);
    }

    /**
     * 获取用户信息
     *
     * @param openId 用户的OpenId
     * @return 用户信息报文
     */
    @Override
    public Map<String, Object> fetchInfo(String openId) {
        return null;
    }
}
