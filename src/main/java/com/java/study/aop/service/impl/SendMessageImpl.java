package com.java.study.aop.service.impl;

import com.java.study.aop.service.SendMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 发送模拟实现
 *
 * @author zhangwenhao
 * @date 2022-04-06 15:31
 */
@Service
public class SendMessageImpl implements SendMessage {
    private final Logger logger = LoggerFactory.getLogger(SendMessageImpl.class);
    /**
     * description: 发送
     *
     * @param sender -- 发送人
     * @param to     -- 接收人
     * @param text   -- 发送内容
     * @return java.lang.String
     * @author zhangwenhao
     * @date 2022/4/6 15:30
     */
    @Override
    public String send(String sender, String to, String text) {
        logger.info("发送信息：sender-" + sender + ",to-" + to + ",text-" + text);
        return "发送成功";
    }


    public String send1(String sender, String to, String text) {
        logger.info("发送信息：sender-" + sender + ",to-" + to + ",text-" + text);
        return "发送成功";
    }
}
