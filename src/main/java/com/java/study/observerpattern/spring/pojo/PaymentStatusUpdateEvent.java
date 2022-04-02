package com.java.study.observerpattern.spring.pojo;

import org.springframework.context.ApplicationEvent;

/**
 * 支付状态更新事件
 *
 * @author zhangwenhao
 * @date 2022-04-02 15:32
 */
public class PaymentStatusUpdateEvent extends ApplicationEvent {
    public PaymentStatusUpdateEvent(PaymentInfo source) {
        super(source);
    }
}
