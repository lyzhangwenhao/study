package com.java.study.test;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author zhangwenhao
 * @Description
 * @date 2022/03/20/22:28
 */
public class Test {
    public static void main(String[] args) {
//        List<List<String>> list = new ArrayList<>();
//        List<String> inner = new ArrayList<>();
//        list.add(inner);
//        inner.add("zhangsan");
//
//        List<String> inner2 = inner;
//        inner2.add("lisi=");
//
//        for (List<String> strings : list) {
//            System.out.println(strings.toString());
//        }

//        AtomicInteger atomicInteger = new AtomicInteger();
//        atomicInteger.compareAndSet(0, 2);
//        System.out.println(atomicInteger.getAndIncrement());
        ThreadLocal threadLocal = new ThreadLocal();
        Thread thread1 = new Thread(() -> {
            threadLocal.set(1);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(threadLocal.get());
            threadLocal.remove();
        });
        Thread thread2 = new Thread(() -> {
            threadLocal.set(2);
            System.out.println(threadLocal.get());
            threadLocal.remove();
            System.out.println(threadLocal.get());
        });
        thread1.start();
        thread2.start();
    }
}
