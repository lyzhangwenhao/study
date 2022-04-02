package com.java.study.proxy.staticagent.proxy;

import com.java.study.proxy.SendMessage;

/**
 * @author zhangwenhao
 * @Description
 * @date 2022/03/20/17:00
 */
public class SendMessageProxy implements SendMessage {

    private final SendMessage sendMessage;

    public SendMessageProxy(SendMessage sendMessage) {
        this.sendMessage = sendMessage;
    }

    @Override
    public boolean sendMessage(String senderName, String acceptName, String message) {
        System.out.println("调用前");
        boolean result = sendMessage.sendMessage(senderName, acceptName, message);
        System.out.println("调用后");
        return result;
    }

    @Override
    public String printLog(String logMessage) {
        System.out.println("打印日志前操作");
        String result = sendMessage.printLog(logMessage);
        System.out.println("打印日志后操作");
        return result;
    }
}
