package com.github.berry.wechat.utility.service.standard;

import java.util.Map;

/**
 * <p>
 *     微信公众号关注用户管理业务处理接口定义。
 * </p>
 * Created by Eugene on 2016/12/17.
 */
public interface IWxUserManagerService {
    /**
     * 获取全部关注用户列表，一次拉取调用最多拉取10000个关注者的OpenID，可以通过多次拉取的方式来满足需求。
     * 关注用户列表已返回完时，返回next_openid为空。
     *
     * @return 关注者列表报文
     */
    public Map<String, Object> fetchUsers();

    /**
     * 获取关注用户列表，从指定的nextOpenId开始获取（不包括nextOpenId）。
     * 关注用户列表已返回完时，返回next_openid为空。
     *
     * @param nextOpenId 本次获取列表的开始OpenId
     * @return 关注用户列表报文
     */
    public Map<String, Object> fetchUsers(String nextOpenId);

    /**
     * 获取用户信息
     *
     * @param openId 用户的OpenId
     * @return 用户信息报文
     */
    public Map<String, Object> fetchInfo(String openId);
}
