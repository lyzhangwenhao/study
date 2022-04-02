package com.java.study.proxy;

/**
 * @author zhangwenhao
 * @Description
 * @date 2022/03/20/16:17
 */
public interface SendMessage {
    boolean sendMessage(String senderName, String acceptName, String message);

    String printLog(String logMessage);
}
