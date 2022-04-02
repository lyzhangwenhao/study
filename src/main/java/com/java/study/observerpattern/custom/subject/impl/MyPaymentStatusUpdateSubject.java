package com.java.study.observerpattern.custom.subject.impl;

import com.java.study.observerpattern.custom.observer.MyObserver;
import com.java.study.observerpattern.custom.subject.Subject;

import java.util.ArrayList;
import java.util.List;

/**
 * 更改支付状态的被观察者
 *
 * @author zhangwenhao
 * @date 2022-04-01 15:36
 */
public class MyPaymentStatusUpdateSubject implements Subject {

    private List<MyObserver> myObservers = new ArrayList<>();

    /**
     * description: 添加观察者
     *
     * @param myObserver -- 添加的观察者
     * @author zhangwenhao
     * @date 2022/4/1 15:32
     */
    @Override
    public void addObserver(MyObserver myObserver) {
        myObservers.add(myObserver);
    }

    /**
     * description: 移除观察者
     *
     * @param myObserver --
     * @author zhangwenhao
     * @date 2022/4/1 15:33
     */
    @Override
    public void removeObserver(MyObserver myObserver) {
        myObservers.remove(myObserver);
    }

    /**
     * description: 通知观察者
     *
     * @author zhangwenhao
     * @date 2022/4/1 15:34
     */
    @Override
    public void notifyObservers() {
        for (MyObserver myObserver : myObservers) {
            myObserver.update();
        }
    }

    public void updatePaymentStatus(int status){
        // 业务逻辑操作
        System.out.println("更新支付状态为：" + status);

        // 通知观察者
        this.notifyObservers();
    }
}
