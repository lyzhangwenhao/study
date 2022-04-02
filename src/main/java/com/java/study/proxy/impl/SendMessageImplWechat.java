package com.java.study.proxy.impl;

import com.java.study.proxy.SendMessage;

/**
 * @author zhangwenhao
 * @Description
 * @date 2022/03/20/16:20
 */
public class SendMessageImplWechat implements SendMessage {
    @Override
    public boolean sendMessage(String senderName, String acceptName, String message) {
        if (senderName != null) {
            System.out.println(senderName + "向" + acceptName + "发送微信消息：" + message + "结果：成功！");
            return true;
        } else {
            System.out.println("微信消息发送发送失败！");
            return false;
        }
    }

    @Override
    public String printLog(String logMessage) {
        System.out.println(this.getClass().getName() + "打印日志");
        return logMessage;
    }
}
