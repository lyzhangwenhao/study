package com.java.study.observerpattern.custom.observer.impl;


import com.java.study.observerpattern.custom.observer.MyObserver;

/**
 * 库存服务
 *
 * @author zhangwenhao
 * @date 2022-04-01 15:18
 */
public class MyObserverStock implements MyObserver {

    /**
     * description:
     * @author zhangwenhao
     * @date 2022/4/1 15:30
     */
    @Override
    public void update() {
        System.out.println("库存服务收到通知");
    }
}
