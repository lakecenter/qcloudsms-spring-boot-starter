package com.github.zhangquanli.qcloudsms;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * QcloudsmsProperties
 *
 * @author zhangquanli
 */
@ConfigurationProperties(prefix = "qcloud.sms")
public class QcloudsmsProperties {

    /**
     * 是否启用
     */
    private Boolean enabled;
    /**
     * 应用编号
     */
    private Integer appId;
    /**
     * 应用密钥
     */
    private String appKey;

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public Integer getAppId() {
        return appId;
    }

    public void setAppId(Integer appId) {
        this.appId = appId;
    }

    public String getAppKey() {
        return appKey;
    }

    public void setAppKey(String appKey) {
        this.appKey = appKey;
    }
}
