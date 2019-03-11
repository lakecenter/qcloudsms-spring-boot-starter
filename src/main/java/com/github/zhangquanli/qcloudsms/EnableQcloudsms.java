package com.github.zhangquanli.qcloudsms;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * 添加此注解，开启腾讯云短信
 *
 * @author zhangquanli
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@Import({QcloudsmsAutoConfiguration.class})
public @interface EnableQcloudsms {
}
