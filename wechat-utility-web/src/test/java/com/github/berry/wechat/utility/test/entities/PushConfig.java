package com.github.berry.wechat.utility.test.entities;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * <p>
 *     推送配置
 * </p>
 * Created by Eugene on 2016/12/24.
 */
@Component
public class PushConfig {

    @Value("${push.measure.conclusion}")
    private String measureConclusion;

    public PushConfig() {
    }

    public String getMeasureConclusion() {
        return measureConclusion;
    }
}
