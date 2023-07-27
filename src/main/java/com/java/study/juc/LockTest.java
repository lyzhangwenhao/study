package com.java.study.juc;

import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * @author zhangwenhao
 * @date 2023-07-13 17:04
 */
public class LockTest {
    private static volatile int num;
    public static void main(String[] args) throws InterruptedException {
        method3();
    }
    public static void method3() throws InterruptedException {
        new Thread(() -> {
            for (int i = 0; i < 100000; i++) {
//                optionNum(true);
                numAdd();
//                System.out.println(Thread.currentThread().getName() + "操作num:" + num);
            }
        }, "线程1").start();
        new Thread(() -> {
            for (int i = 0; i < 100000; i++) {
//                optionNum(false);
                numDec();
//                System.out.println(Thread.currentThread().getName() + "操作num:" + num);
            }
        }, "线程2").start();
        Thread.sleep(2000);
        System.out.println(num);
    }
    public synchronized static void optionNum(boolean flag) {
        if (flag) {
            numAdd();
        } else {
            numDec();
        }
    }
    public static synchronized void numAdd() {
        num++;
    }
    public static synchronized void numDec() {
        num--;
    }
    public static void method2() throws InterruptedException {
        Thread thread1 = new Thread(() -> {
            while (true) {
                if (Thread.currentThread().isInterrupted()) {
                    System.out.println(Thread.currentThread().getName() + "线程中断");
                    return;
                }
                System.out.println("线程1");
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }, "线程1");
        thread1.start();
        Thread.sleep(2000);
        new Thread(()->{
            thread1.interrupt();
        }).start();
    }
    public static void method1() {
        Object a = new Object();
        Object b = new Object();
        new Thread(() -> {
            synchronized (a) {
                System.out.println("线程1获取到锁a");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (b) {
                    System.out.println("线程1获取到锁b");
                }
            }
        }, "1").start();
        new Thread(() -> {
            synchronized (b) {
                System.out.println("线程2获取到锁b");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (a) {
                    System.out.println("线程2获取到锁a");
                }
            }
        }, "2").start();
        ConcurrentMap<String, String> map = new ConcurrentHashMap<>();
        map.put("1", "1");
    }
    public static void method0() {
        Callable<String> callable = new Callable<String>() {
            @Override
            public String call() throws Exception {
                return null;
            }
        };
//        CompletableFuture.
    }
}
