package com.java.study.observerpattern.custom.observer.impl;


import com.java.study.observerpattern.custom.observer.MyObserver;

/**
 * 邮件服务
 *
 * @author zhangwenhao
 * @date 2022-04-01 15:19
 */
public class MyObserverEamil implements MyObserver {
    /**
     * description:
     * @author zhangwenhao
     * @date 2022/4/1 15:30
     */
    @Override
    public void update() {
        System.out.println("邮件服务收到通知");
    }
}
