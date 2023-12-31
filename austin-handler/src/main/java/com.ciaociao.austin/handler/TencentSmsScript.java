package com.ciaociao.austin.handler;

import cn.hutool.core.util.IdUtil;
import com.alibaba.fastjson.JSON;
import com.google.common.base.Throwables;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.profile.HttpProfile;
import com.tencentcloudapi.sms.v20210111.SmsClient;
import com.tencentcloudapi.sms.v20210111.models.SendSmsRequest;
import com.tencentcloudapi.sms.v20210111.models.SendSmsResponse;
import lombok.extern.slf4j.Slf4j;


/**
 * @author ciaociao
 * 1. 发送短信接入文档：https://cloud.tencent.com/document/api/382/55981
 * 2. 推荐直接使用SDK调用
 * 3. 推荐使用API Explorer 生成代码
 */
@Slf4j
public class TencentSmsScript {

    public static void send(String phone, String content,String secretId,String secretKey,String sdkAppId) {

        try {

            /**
             * 初始化
             */
            Credential cred = new Credential(secretId, secretKey);
            HttpProfile httpProfile = new HttpProfile();
            httpProfile.setEndpoint("sms.tencentcloudapi.com");
            ClientProfile clientProfile = new ClientProfile();
            clientProfile.setHttpProfile(httpProfile);
            SmsClient client = new SmsClient(cred, "ap-guangzhou", clientProfile);

            /**
             * 组装入参
             */
            SendSmsRequest req = new SendSmsRequest();
            String[] phoneNumberSet1 = new String[]{phone};
            req.setPhoneNumberSet(phoneNumberSet1);
            req.setSmsSdkAppId(sdkAppId);
            req.setSignName("公诸同好报公众号");
            req.setTemplateId("1928622");
            String[] templateParamSet1 = {content};
            req.setTemplateParamSet(templateParamSet1);
            req.setSessionContext(IdUtil.fastSimpleUUID());

            /**
             * 发送
             */
            SendSmsResponse response = client.SendSms(req);

            log.info(JSON.toJSONString(response));
        } catch (Exception e) {
            log.error(Throwables.getStackTraceAsString(e));
        }
    }

    public static void main(String[] args) {

        send("15073107407", "6666", "AKIDwoW5ZwETceZZyGQWYUCjIhsslcJvW6f9", "oX9d2LYwJtYSQTTN8pOwMm9KOME0a2cH", "1400854704");
    }
}