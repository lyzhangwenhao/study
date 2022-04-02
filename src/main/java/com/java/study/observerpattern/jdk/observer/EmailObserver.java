package com.java.study.observerpattern.jdk.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * 邮件观察者
 *
 * @author zhangwenhao
 * @date 2022-04-01 16:01
 */
public class EmailObserver implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("jdk方式邮件收到通知");
    }
}
