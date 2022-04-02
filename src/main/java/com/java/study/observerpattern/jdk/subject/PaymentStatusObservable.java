package com.java.study.observerpattern.jdk.subject;

import java.util.Observable;

/**
 * 支付状态变更被观察者
 *
 * @author zhangwenhao
 * @date 2022-04-01 16:04
 */
public class PaymentStatusObservable extends Observable {
    public void updatePaymentStatus(int status){
        // 业务逻辑操作
        System.out.println("jdk方式更新支付状态为：" + status);

        // 通知观察者
        // 通过调用这个方法，标识被观察者状态已经变更，Observable才会通知观察者
        this.setChanged();
        this.notifyObservers();
    }
}
