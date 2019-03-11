package com.github.zhangquanli.qcloudsms;

import com.github.qcloudsms.SmsSingleSender;
import com.github.qcloudsms.SmsSingleSenderResult;
import com.github.qcloudsms.httpclient.HTTPException;
import com.github.zhangquanli.qcloudsms.exception.QcloudsmsException;

import java.io.IOException;

/**
 * QcloudsmsImpl
 *
 * @author zhangquanli
 */
public class QcloudsmsImpl implements Qcloudsms {

    private Boolean enabled;
    private Integer appId;
    private String appKey;

    public QcloudsmsImpl(Boolean enabled, Integer appId, String appKey) {
        this.enabled = enabled;
        this.appId = appId;
        this.appKey = appKey;
    }

    @Override
    public void sendSms(String phoneNumber, String smsSign, Integer templateId, String... params) throws QcloudsmsException {
        try {
            // 校验是否启用
            if (!enabled) {
                return;
            }
            // 发送短信
            SmsSingleSender sender = new SmsSingleSender(appId, appKey);
            SmsSingleSenderResult smsSingleSenderResult = sender
                    .sendWithParam("86", phoneNumber, templateId, params, smsSign, "", "");
            // 如发送失败，获取错误信息
            if (smsSingleSenderResult.result != 0) {
                throw new QcloudsmsException(smsSingleSenderResult.errMsg);
            }
        } catch (HTTPException | IOException e) {
            throw new QcloudsmsException(e.getMessage());
        }
    }
}
