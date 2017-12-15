package com.github.berry.wechat.entities.meta;


/**
 * <P>
 *     响应图片消息
 * </P>
 * Created by Eugene on 2016/12/19.
 */
public class ImageResponseMessage extends BaseResponseMessage {

    /**
     * 图片
     */
    private ResponseImage Image;

    public ResponseImage getImage() {
        return Image;
    }

    public void setImage(ResponseImage image) {
        Image = image;
    }
}
