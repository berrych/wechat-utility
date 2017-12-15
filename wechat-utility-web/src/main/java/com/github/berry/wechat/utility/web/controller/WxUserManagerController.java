package com.github.berry.wechat.utility.web.controller;

import com.github.berry.wechat.utility.service.standard.IWxUserManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * <p>
 *     微信公众号关注用户管理Controller实现
 * </p>
 * Created by Eugene on 2016/12/17.
 */
@Controller
@Scope("prototype")
@RequestMapping("/user/manager")
public class WxUserManagerController {

    @Autowired
    private IWxUserManagerService wxUserManagerService;

    /**
     * 获取关注者列表，单次获取上线10000条
     * @return 关注者列表报文
     */
    @RequestMapping(value = "/users/fetch")
    public Map<String, Object> fetchUsers() {
        return this.wxUserManagerService.fetchUsers();
    }

    /**
     * 获取关注者列表,从指定的nextOpenId开始获取（不包括nextOpenId），单次获取上线10000条
     * @return 关注者列表报文
     */
    @RequestMapping(value = "/users/fetch/{nextOpenid}")
    public Map<String, Object> fetchUsers(@PathVariable String nextOpenId) {
        return this.wxUserManagerService.fetchUsers(nextOpenId);
    }
}
