package com.java.study.thread;


import java.util.concurrent.*;

/**
 * 线程相关内容学习
 *
 * @author zhangwenhao
 * @date 2022-05-28 15:00
 */
public class ThreadStudyTest {
    public static void main(String[] args) throws InterruptedException {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(3, 20, 10000, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<>(10), Executors.defaultThreadFactory(), new ThreadPoolExecutor.DiscardPolicy());
        int num = 0;
        while (num < 500) {
            num ++;
            threadPoolExecutor.submit(ThreadStudyTest::method);
        }
        while (true) {
            Thread.sleep(10000);
            System.out.println(threadPoolExecutor.getActiveCount());
            System.out.println(threadPoolExecutor.getPoolSize());
            System.out.println(threadPoolExecutor.getTaskCount());
        }
    }

    private static void method(){
        System.out.println(Thread.currentThread().getName());
    }


    private static void method2(){
        System.out.println(Thread.currentThread().getName());
    }
}
