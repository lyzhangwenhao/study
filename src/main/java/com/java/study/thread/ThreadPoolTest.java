package com.java.study.thread;

import java.util.concurrent.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author zhangwenhao
 * @date 2023-07-12 10:16
 */
public class ThreadPoolTest {
    public static void main(String[] args) {
        // 创建线程池
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(10, 20, 5, TimeUnit.SECONDS, new ArrayBlockingQueue<>(1));
        Runnable runnable = () -> {
            System.out.println("线程池执行任务");
            throw new RuntimeException("线程池执行任务异常");
        };
        for (int i = 0; i<100; i++) {
            System.out.println(i);
            threadPoolExecutor.execute(runnable);
        }
        // 0, Integer.MAX_VALUE,60L, TimeUnit.SECONDS,new SynchronousQueue<Runnable>()
        ExecutorService executorService = Executors.newCachedThreadPool();

        ExecutorService executorService1 = Executors.newFixedThreadPool(10);

        ExecutorService executorService2 = Executors.newSingleThreadExecutor();
        executorService2.execute(runnable);

        Lock lock = new ReentrantLock();
        lock.lock();
        lock.unlock();
    }
}
