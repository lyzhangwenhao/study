package com.java.study.observerpattern.jdk;

import com.java.study.observerpattern.jdk.observer.EmailObserver;
import com.java.study.observerpattern.jdk.observer.StockObserver;
import com.java.study.observerpattern.jdk.subject.PaymentStatusObservable;

/**
 * jdk观察者模式测试
 *
 * @author zhangwenhao
 * @date 2022-04-01 16:07
 */
public class MainTest {
    public static void main(String[] args) {
        // 事件源 -- 被观察者
        PaymentStatusObservable paymentStatusObservable = new PaymentStatusObservable();

        // 添加观察者
        paymentStatusObservable.addObserver(new EmailObserver());
        paymentStatusObservable.addObserver(new StockObserver());

        // 支付状态变更
        paymentStatusObservable.updatePaymentStatus(2);
    }
}
