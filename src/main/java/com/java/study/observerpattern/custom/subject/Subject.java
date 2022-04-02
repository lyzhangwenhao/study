package com.java.study.observerpattern.custom.subject;

import com.java.study.observerpattern.custom.observer.MyObserver;

/**
 * 被观察者
 *
 * @author zhangwenhao
 * @date 2022-04-01 15:32
 */
public interface Subject {
    /**
     * description: 添加观察者
     * @author zhangwenhao
     * @date 2022/4/1 15:32
     * @param myObserver -- 添加的观察者
     */
    void addObserver(MyObserver myObserver);

    /**
     * description:
     * @author zhangwenhao
     * @date 2022/4/1 15:33
     * @param myObserver --
     */
    void removeObserver(MyObserver myObserver);

    /**
     * description: 通知观察者
     * @author zhangwenhao
     * @date 2022/4/1 15:34
     */
    void notifyObservers();
}
