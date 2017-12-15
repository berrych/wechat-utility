package com.github.berry.wechat.entities.norm;

/**
 * 微信API模板实体
 * @author Eugene
 */
public class WxApiTemplate {
    /******************************
     * 微信SDK相关URL
     *****************************/
    /**
     * 微信OPEN SDK域名
     */
    public final static String PREFIX_SDK_OPEN_URL_DOMAIN_NAME = "https://open.weixin.qq.com";

    /**
     * 微信API SDK域名
     */
    public final static String PREFIX_SDK_API_URL_DOMAIN_NAME = "https://api.weixin.qq.com";

    /**
     * 微信SDK根地址
     */
    public final static String PREFIX_SDK_URL_ROOT = PREFIX_SDK_API_URL_DOMAIN_NAME + "/cgi-bin";

    /**
     * 微信SDK获取访问权限Token
     */
    public final static String API_SDK_ACCESS_TOKEN = PREFIX_SDK_URL_ROOT + "/token?grant_type=client_credential&appid={0}&secret={1}";

    /**
     * 微信SDK获取调用微信JS接口的临时票据
     */
    public final static String API_SDK_JSAPI_TICKET = PREFIX_SDK_URL_ROOT + "/ticket/getticket?access_token={0}&type=jsapi";

    /***********
     * 自定义菜单 *
     ***********/
    /**
     * 创建菜单
     */
    public final static String API_MENU_SDK_CREATE = PREFIX_SDK_URL_ROOT + "/menu/create?access_token={0}";

    /**
     * 获取菜单
     */
    public final static String API_MENU_SDK_GET = PREFIX_SDK_URL_ROOT + "/menu/get?access_token={0}";

    /**
     * 删除菜单
     */
    public final static String API_MENU_SDK_DELETE = PREFIX_SDK_URL_ROOT + "/menu/delete?access_token={0}";


    /***********
     * 素材管理 *
     ***********/
    /**
     * 批量获取素材
     */
    public final static String API_MATERIAL_SDK_BATCH_GET = PREFIX_SDK_URL_ROOT + "/material/batchget_material?access_token={0}";

    /**
     * 获取单个永久素材
     */
    public final static String API_MATERIAL_SDK_GET = PREFIX_SDK_URL_ROOT + "/material/get_material?access_token={0}";

    /**
     * 获取单个临时素材
     */
    public final static String API_MEDIA_SDK_GET = PREFIX_SDK_URL_ROOT + "/media/get?access_token={0}&media_id={1}";



    /***********
     * 用户管理 *
     ***********/

    /**
     * 获取全部用户列表
     */
    public final static String API_USER_SDK_GET_ALL = PREFIX_SDK_URL_ROOT + "/user/get?access_token={0}";

    /**
     * 获取全部用户列表，并指定下openid为下一次获取的开始位置
     */
    public final static String API_USER_SDK_GET_OFFSET = PREFIX_SDK_URL_ROOT + "/user/get?access_token={0}&next_openid={1}";

    /**
     * 获取用户基本信息
     */
    public final static String API_USER_SDK_GET_INFO = PREFIX_SDK_URL_ROOT + "/user/info?access_token={0}&openid={1}&lang=zh_CN";

    /**
     * 批量获取用户基本信息
     */
    public final static String API_USER_SDK_BATCH_GET_INFO = PREFIX_SDK_URL_ROOT + "/user/info/batchget?access_token={0}";

    /***********
     * 网页授权 *
     ***********/

    /**
     * 同意授权获取code
     */
    public final static String API_OAUTH2_SDK_AUTHORIZE = PREFIX_SDK_OPEN_URL_DOMAIN_NAME + "/connect/oauth2/authorize?appid={0}&redirect_uri={1}&response_type=code&scope={2}&state={3}#wechat_redirect";

    /**
     * 获取网页授权Access_Token
     */
    public final static String API_OAUTH2_SDK_ACCESS_TOKEN = PREFIX_SDK_API_URL_DOMAIN_NAME + "/sns/oauth2/access_token?appid={0}&secret={1}&code={2}&grant_type=authorization_code";

    /**
     * 刷新网页授权Access_Token
     */
    public final static String API_OAUTH2_SDK_REFRESH_TOKEN = PREFIX_SDK_API_URL_DOMAIN_NAME + "/sns/oauth2/refresh_token?appid={0}&grant_type=refresh_token&refresh_token={1}";

    /**
     * 获取用户信息
     */
    public final static String API_OAUTH2_SDK_USERINFO = PREFIX_SDK_API_URL_DOMAIN_NAME + "/sns/userinfo?access_token={0}&openid={1}&lang=zh_CN";

    /**
     * 检验授权凭证（access_token）是否有效
     */
    public final static String API_OAUTH2_SDK_CHECK_ACCESS_TOKEN = PREFIX_SDK_API_URL_DOMAIN_NAME + "/sns/auth?access_token={0}&openid={1}";

    /***********
     * 模板消息 *
     ***********/
    /**
     * 发送模板消息
     */
    public final static String API_PUSH_SDK_MESSAGE_TEMPLATE_SEND = PREFIX_SDK_URL_ROOT + "/message/template/send?access_token={0}";

}
