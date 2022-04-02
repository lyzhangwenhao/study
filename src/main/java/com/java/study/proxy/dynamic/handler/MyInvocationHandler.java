package com.java.study.proxy.dynamic.handler;

import com.java.study.proxy.SendMessage;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author zhangwenhao
 * @Description
 * @date 2022/03/20/16:28
 */
public class MyInvocationHandler implements InvocationHandler {

    private Object sendMessage;

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("方法执行前进行的操作");
        // 执行方法
        Object invoke = method.invoke(sendMessage, args);
        System.out.println("方法执行后进行的操作");
        return invoke;
    }

    public Object getInstance(Object sendMessage){
        this.sendMessage = sendMessage;
        return Proxy.newProxyInstance(sendMessage.getClass().getClassLoader(), sendMessage.getClass().getInterfaces(), this);
    }
}
