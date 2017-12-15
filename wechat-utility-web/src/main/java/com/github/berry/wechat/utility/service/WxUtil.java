package com.github.berry.wechat.utility.service;

import java.util.UUID;

/**
 * Created by Eugene on 2016/11/8.
 */
public class WxUtil {

    public static String createNonceStr() {
        return UUID.randomUUID().toString();
    }

    public static String createTimestamp() {
        //系统时间默认单位为秒，当前转换为秒
        return Long.toString(System.currentTimeMillis() / 1000);
    }
}
