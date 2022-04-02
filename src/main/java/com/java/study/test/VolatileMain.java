package com.java.study.test;

/**
 * @author zhangwenhao
 * @Description
 * @date 2022/03/20/22:16
 */
public class VolatileMain {
    private static volatile boolean flag =false;

    public static void main(String[] args) throws InterruptedException {
        new Thread(new Runnable() {
            @Override
            public void run() {
                int i = 0;
                while (!flag){
                    System.out.println(++i);
                }
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                flag = true;
            }
        }).start();
    }

}
