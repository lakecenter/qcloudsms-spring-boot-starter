package com.github.zhangquanli.qcloudsms;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * QcloudsmsAutoConfiguration
 *
 * @author zhangquanli
 */
@Configuration
@EnableConfigurationProperties({QcloudsmsProperties.class})
public class QcloudsmsAutoConfiguration {

    private QcloudsmsProperties qcloudsmsProperties;

    public QcloudsmsAutoConfiguration(QcloudsmsProperties qcloudsmsProperties) {
        this.qcloudsmsProperties = qcloudsmsProperties;
    }

    @Bean
    public Qcloudsms qcloudsms() {
        Boolean enabled = qcloudsmsProperties.getEnabled();
        Integer appId = qcloudsmsProperties.getAppId();
        String appKey = qcloudsmsProperties.getAppKey();
        return new QcloudsmsImpl(enabled, appId, appKey);
    }
}
