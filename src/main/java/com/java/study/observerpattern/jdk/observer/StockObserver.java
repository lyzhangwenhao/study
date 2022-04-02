package com.java.study.observerpattern.jdk.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * 库存通知
 *
 * @author zhangwenhao
 * @date 2022-04-01 16:02
 */
public class StockObserver implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("jdk方式库存收到通知");
    }
}
