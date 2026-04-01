package com.clx.xiaochangshu.auth.sms;

import com.aliyun.dypnsapi20170525.models.SendSmsVerifyCodeRequest;
import com.aliyun.dypnsapi20170525.models.SendSmsVerifyCodeResponse;
import com.aliyun.teautil.models.RuntimeOptions;
import com.clx.framework.common.util.JsonUtils;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @description: 短信发送工具类
 **/
@Component
@Slf4j
public class AliyunSmsHelper {

    @Resource
    private com.aliyun.dypnsapi20170525.Client client;

    /**
     * 发送短信
     * @param signName 短信签名
     * @param templateCode 短信模板编码
     * @param phone 手机号
     * @param templateParam 模板参数
     * @return 是否发送成功
     */
    public boolean sendMessage(String signName, String templateCode, String phone, String templateParam) {
        SendSmsVerifyCodeRequest sendSmsVerifyCodeRequest = new SendSmsVerifyCodeRequest()
                .setSignName(signName)
                .setTemplateCode(templateCode)
                .setPhoneNumber(phone)
                .setTemplateParam(templateParam);

        RuntimeOptions runtime = new RuntimeOptions();

        try {
            log.info("==> 开始短信发送, phone: {}, signName: {}, templateCode: {}, templateParam: {}", phone, signName, templateCode, templateParam);

            // 发送短信
            SendSmsVerifyCodeResponse response = client.sendSmsVerifyCodeWithOptions(sendSmsVerifyCodeRequest, runtime);

            log.info("==> 短信发送成功, response: {}", JsonUtils.toJsonString(response));
            return true;
        } catch (Exception error) {
            log.error("==> 短信发送错误: ", error);
            return false;
        }
    }
}