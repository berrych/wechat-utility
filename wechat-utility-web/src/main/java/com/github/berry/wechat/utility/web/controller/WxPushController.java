package com.github.berry.wechat.utility.web.controller;

import com.github.berry.wechat.entities.norm.WxKeys;
import com.github.berry.wechat.utility.service.standard.IWxPushService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

/**
 * <p>
 *     微信推送控制器
 * </p>
 * Created by Eugene on 2016/12/24.
 */
@Controller
@Scope("prototype")
@RequestMapping("/wx/push")
public class WxPushController {

    /**
     * 微信推送业务实现
     */
    @Autowired
    private IWxPushService wxPushService;

    @RequestMapping(value = "/message/template", method = RequestMethod.POST)
    public void templateMessage(HttpServletRequest request) {
        String data = request.getParameter(WxKeys.PUSH_KEY_DATA);
        this.wxPushService.batchPushTemplateMessage(data);
    }
}
