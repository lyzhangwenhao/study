package com.java.study.proxy.dynamic.interceptor;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author zhangwenhao
 * @Description
 * @date 2022/03/20/18:12
 */
public class MyMethodIntgerceptor implements MethodInterceptor {
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("方法执行前");
        Object result = methodProxy.invokeSuper(o, objects);
        System.out.println("方法执行后");
        return result;
    }
}
