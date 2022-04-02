package com.java.study.test;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author zhangwenhao
 * @Description
 * @date 2022/03/20/22:28
 */
public class Test {
    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger(0);
        atomicInteger.incrementAndGet();

    }
}
