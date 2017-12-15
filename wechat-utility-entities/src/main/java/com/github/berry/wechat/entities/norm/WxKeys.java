package com.github.berry.wechat.entities.norm;

/**
 * 微信开发相关键匙实体
 * @author Eugene
 */
public class WxKeys {

    /**
     * 微信加密签名，signature结合了开发者填写的token参数和请求中的timestamp参数、nonce参数
     */
    public static final String BASE_KEY_SIGNATURE = "signature";

    /**
     * 时间戳，由微信验证服务器时传入
     */
    public static final String BASE_KEY_TIMESTAMP = "timestamp";

    /**
     * 随机数，由微信验证服务器时传入
     */
    public static final String BASE_KEY_NONCE = "nonce";

    /**
     * 随机字符串，由微信验证服务器时传入
     */
    public static final String BASE_KEY_ECHOSTR = "echostr";

    /**
     * 用户自定义令牌，对应由用户登录微信管理后台后，在菜单开发 - 基本配置 - 服务器配置中配置的令牌值
     */
    public static final String BASE_KEY_TOKEN = "token";

    /**
     * 微信公总号应用ID，对应由用户登录微信管理后台后，在菜单开发 - 基本配置 - AppID(开发者ID)
     */
    public final static String BASE_KEY_APPID = "appId";

    /**
     * 微信公总号应用秘钥，对应由用户登录微信管理后台后，在菜单开发 - 基本配置 - AppSecret(应用秘钥)
     */
    public final static String BASE_KEY_APPSECRET = "appSecret";

    /**
     * 普通/网页授权access_token，有效期7200秒（2小时），每日调用限制次数2000次（并发获取access_token会导致access_token互相覆盖，影响具体的业务功能）
     */
    public final static String BASE_KEY_ACCESSTOKEN = "access_token";

    /**
     * 用于用户刷新网页授权access_token的refresh_accesstoken，有效期30天
     */
    public final static String BASE_KEY_REFRESH_ACCESSTOKEN = "refresh_token";


    //&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&


    /**
     * 结果标识
     */
    public final static String KEY_FLAG = "flag";

    /**
     * 用户授权作用域
     */
    public final static String KEY_SCOPE = "scope";

    /**
     * 媒质Id
     */
    public final static String KEY_MEDIA_ID = "media_id";

    /**
     * 图文消息列表
     */
    public final static String KEY_NEWS_ITEM = "news_item";

    /**
     * 标题
     */
    public final static String KEY_TITLE = "title";

    /**
     * 偏移量
     */
    public final static String KEY_OFFSET = "offset";

    /**
     * 类型
     */
    public final static String KEY_TYPE = "type";

    /**
     * 名称描述
     */
    public final static String KEY_NAME = "name";

    /**
     * 键描述
     */
    public final static String KEY_KEY = "key";

    /**
     * 按钮
     */
    public final static String KEY_BUTTON = "button";

    /**
     * 子级按钮
     */
    public final static String KEY_SUB_BUTTON = "sub_button";

    /**
     * 访问地址
     */
    public final static String KEY_URL = "url";

    /**
     * 总数
     */
    public final static String KEY_TOTAL = "total";

    /**
     * 统计数量
     */
    public final static String KEY_COUNT = "count";

    /**
     * 数据
     */
    public final static String KEY_DATA = "data";

    /**
     * Openid
     */
    public final static String KEY_OPENID = "openid";

    /**
     * 用户特权信息
     */
    public final static String KEY_PRIVILEGE = "privilege";

    /**
     * 下一个Openid
     */
    public final static String KEY_NEXT_OPENID = "next_openid";

    /**
     * 用户是否订阅该公众号标识，值为0时，代表此用户没有关注该公众号，拉取不到其余信息
     */
    public final static String KEY_SUBSCRIBE = "subscribe";

    /**
     * 昵称
     */
    public final static String KEY_NICKNAME = "nickname";

    /**
     * 性别
     */
    public final static String KEY_SEX = "sex";

    /**
     * 国家
     */
    public final static String KEY_COUNTRY = "country";

    /**
     * 城市
     */
    public final static String KEY_PROVINCE = "province";

    /**
     * 城市
     */
    public final static String KEY_CITY = "city";

    /**
     * 语言
     */
    public final static String KEY_LANGUAGE = "language";

    /**
     * 头像
     */
    public final static String KEY_HEADIMGURL = "headimgurl";

    /**
     * 用户关注时间，为时间戳。如果用户曾多次关注，则取最后关注时间
     */
    public final static String KEY_SUBSCRIBE_TIME = "subscribe_time";

    /**
     * 只有在用户将公众号绑定到微信开放平台帐号后，才会出现该字段
     */
    public final static String KEY_UNIONID = "unionid";

    /**
     * 公众号运营者对粉丝的备注，公众号运营者可在微信公众平台用户管理界面对粉丝添加备注
     */
    public final static String KEY_REMARK = "remark";

    /**
     * 用户所在的分组ID
     */
    public final static String KEY_GROUPID = "groupid";

    /**
     * 用户列表
     */
    public final static String KEY_USER_LIST = "user_list";

    /**
     * 用户信息列表
     */
    public final static String KEY_USER_INFO_LIST = "user_info_list";

    /**
     * 动态Ticket
     */
    public final static String KEY_TICKET = "ticket";

    /**
     * 错误码
     */
    public final static String KEY_ERRCODE = "errcode";

    /**
     * 错误信息
     */
    public final static String KEY_ERRMSG = "errmsg";

    /**
     * 有效期
     */
    public final static String KEY_EXPIRES = "expires_in";

    /**
     * 公众号微信根地址
     */
    public final static String KEY_WX_ROOT = "wxRoot";

    /**
     * 接口根地址
     */
    public final static String KEY_SERVE_ROOT = "serveRoot";

    /**************
     * 消息相关Key *
     **************/
    /**
     * 发送方账号
     */
    public final static String MESSAGE_KEY_FROMUSERNAME = "FromUserName";

    /**
     * 开发者微信号
     */
    public final static String MESSAGE_KEY_TOUSERNAME = "ToUserName";

    /**
     * 消息创建时间
     */
    public final static String MESSAGE_KEY_CREATETIME = "CreateTime";

    /**
     * 消息类型
     */
    public final static String MESSAGE_KEY_MSGTYPE = "MsgType";

    /**
     * 消息Id
     */
    public final static String MESSAGE_KEY_MSGID = "MsgId";

    /**
     * 消息内容
     */
    public final static String MESSAGE_KEY_CONTENT = "Content";

    /**
     * 消息标题
     */
    public final static String MESSAGE_KEY_TITLE = "Title";

    /**
     * 消息链接
     */
    public final static String MESSAGE_KEY_URL = "Url";

    /**
     * 消息描述
     */
    public final static String MESSAGE_KEY_DESCRIPTION = "Description";

    /**
     * 图片消息
     */
    public final static String MESSAGE_KEY_IMAGE = "image";

    /**
     * 图片链接
     */
    public final static String MESSAGE_KEY_PICURL = "PicUrl";

    /**
     * 媒体文件标识
     */
    public final static String MESSAGE_KEY_MEDIAID = "MediaId";

    /**
     * 文件格式
     */
    public final static String MESSAGE_KEY_FORMAT = "Format";

    /**
     * 视频消息缩略图的媒体Id
     */
    public final static String MESSAGE_KEY_THUMBMEDIAID = "ThumbMediaId";

    /**
     * 地理位置纬度
     */
    public final static String MESSAGE_KEY_LOCATION_X = "Location_X";

    /**
     * 地理位置经度
     */
    public final static String MESSAGE_KEY_LOCATION_Y = "Location_Y";

    /**
     * 地理位置信息
     */
    public final static String MESSAGE_KEY_LABEL = "Label";

    /**
     * 地图缩放大小
     */
    public final static String MESSAGE_KEY_SCALE = "Scale";

    /***********
     * 网页授权 *
     ***********/
    /**
     * 网页授权code，用于获取网页授权access_token
     */
    public final static String OAUTH2_KEY_CODE = "code";


    /***********
     * 推送    *
     ***********/

    /**
     * 推送用户
     */
    public final static String PUSH_KEY_TOUSER = "touser";

    /**
     * 推送消息跳转地址
     */
    public final static String PUSH_KEY_URL = "url";

    /**
     * 消息模板填充数据
     */
    public final static String PUSH_KEY_DATA = "data";

    /**
     * 推送消息模板id
     */
    public final static String PUSH_KEY_TEMPLATE_ID = "template_id";

    /**
     * 测量结论
     */
    public final static String PUSH_KEY_MEASURE_CONCLUSION = "push.measure.conclusion";

    /************************************
     * 微信相关的固定值
     ************************************/

    /**********
     * 类型值 *
     *********/

    /**
     * 授权作用域，不会弹出授权页面，只能获取用户OpenId
     */
    public final static String VALUE_TYPE_SNSAPI_BASE = "snsapi_base";

    /**
     * 授权作用域，会弹出授权页面，通过OpenId获取用户信息。
     * 只要用户授权，没有关注公众号也能获取其信息
     */
    public final static String VALUE_TYPE_SNSAPI_USERINFO = "snsapi_userinfo";

    /**
     * XML类型
     */
    public final static String VALUE_TYPE_XML = "xml";

    /**
     * 点击推事件
     */
    public final static String VALUE_TYPE_CLICK = "click";

    /**
     * 跳转URL
     */
    public final static String VALUE_TYPE_VIEW = "view";

    /**
     * 扫码推送事件
     */
    public final static String VALUE_TYPE_SCANCODE_PUSH = "scancode_push";

    /**
     * 扫码推事件且弹出"消息接收中"提示框
     */
    public final static String VALUE_TYPE_SCANCODE_WAITMSG = "scancode_waitmsg";

    /**
     * 弹出系统拍照发图
     */
    public final static String VALUE_TYPE_PIC_SYSPHOTO = "pic_sysphoto";

    /**
     * 弹出拍照或者相册发图
     */
    public final static String VALUE_TYPE_PIC_PHOTO_OR_ALBUM = "pic_photo_or_album";

    /**
     * 弹出微信相册发图器
     */
    public final static String VALUE_TYPE_PIC_WEIXIN = "pic_weixin";

    /**
     * 弹出地理位置选择器
     */
    public final static String VALUE_TYPE_LOCATION_SELECT = "location_select";

    /**
     * 下发消息（除文本消息）
     */
    public final static String VALUE_TYPE_MEDIA_ID = "media_id";

    /**
     * 跳转图文消息URL
     */
    public final static String VALUE_TYPE_VIEW_LIMITED = "view_limited";

    /*************
     * 消息类型值 *
     ************/

    /**
     * 文本消息
     */
    public final static String MESSAGE_VALUE_TYPE_TEXT = "text";

    /**
     * 图片消息
     */
    public final static String MESSAGE_VALUE_TYPE_IMAGE = "image";

    /**
     * 语音消息
     */
    public final static String MESSAGE_VALUE_TYPE_VOICE = "voice";

    /**
     * 视频消息
     */
    public final static String MESSAGE_VALUE_TYPE_VIDEO = "video";

    /**
     * 地理位置消息
     */
    public final static String MESSAGE_VALUE_TYPE_LOCATION = "location";

    /**
     * 连接消息
     */
    public final static String MESSAGE_VALUE_TYPE_LINK = "link";



    /*************
     * 标识码类型值 *
     ************/
    /**
     * 成功标识
     */
    public final static int CODE_VALUES_TYPE_SUCCESS = 1;

    /**
     * 失败标识
     */
    public final static int CODE_VALUES_TYPE_ERROR = 0;

    /**
     * 验证码错误
     */
    public final static int CODE_VALUES_TYPE_CODE_ERROR = 2;

    /**
     * 验证码超时
     */
    public final static int CODE_VALUES_TYPE_CODE_TIME_OUT = 3;

    /**
     * 验证码失效
     */
    public final static int CODE_VALUES_TYPE_CODE_INVALID = 4;

}
