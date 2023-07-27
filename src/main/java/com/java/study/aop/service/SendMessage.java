package com.java.study.aop.service;

/**
 * 模拟发送服务
 *
 * @author zhangwenhao
 * @date 2022-04-06 15:29
 */
public interface SendMessage {
    /**
     * description: 发送
     * @author zhangwenhao
     * @date 2022/4/6 15:30
     * @param sender -- 发送人
     * @param to -- 接收人
     * @param text -- 发送内容
     * @return java.lang.String
     */
    String send(String sender, String to, String text);
}
