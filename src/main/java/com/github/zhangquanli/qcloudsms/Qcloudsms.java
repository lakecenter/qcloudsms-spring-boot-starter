package com.github.zhangquanli.qcloudsms;

import com.github.zhangquanli.qcloudsms.exception.QcloudsmsException;

/**
 * Qcloudsms
 *
 * @author zhangquanli
 */
public interface Qcloudsms {

    /**
     * 发送短信
     *
     * @param phoneNumber 手机号码
     * @param smsSign     短信签名
     * @param templateId  模板编号
     * @param params      参数列表
     * @throws QcloudsmsException 发送失败，抛出异常
     */
    void sendSms(String phoneNumber, String smsSign, Integer templateId, String... params) throws QcloudsmsException;
}
