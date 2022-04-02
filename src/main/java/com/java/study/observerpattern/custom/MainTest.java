package com.java.study.observerpattern.custom;

import com.java.study.observerpattern.custom.observer.MyObserver;
import com.java.study.observerpattern.custom.observer.impl.MyObserverEamil;
import com.java.study.observerpattern.custom.observer.impl.MyObserverStock;
import com.java.study.observerpattern.custom.subject.impl.MyPaymentStatusUpdateSubject;

/**
 * 手动编写观察者模式测试类
 *
 * @author zhangwenhao
 * @date 2022-04-01 15:42
 */
public class MainTest {
    public static void main(String[] args) {
        // 被观察者 -- 事件源
        MyPaymentStatusUpdateSubject myPaymentStatusUpdateSubject = new MyPaymentStatusUpdateSubject();

        // 观察者 -- 事件监听器
        MyObserver myObserverEmail = new MyObserverEamil();
        MyObserver myObserverStock = new MyObserverStock();

        // 添加观察者
        myPaymentStatusUpdateSubject.addObserver(myObserverEmail);
        myPaymentStatusUpdateSubject.addObserver(myObserverStock);

        // 发布事件 - 支付状态更新
        myPaymentStatusUpdateSubject.updatePaymentStatus(1);
    }
}
