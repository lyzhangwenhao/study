package com.java.study.function.throwexception;

/**
 * 抛出异常接口
 *
 * @author zhangwenhao
 * @date 2022-06-06 11:09
 */
@FunctionalInterface
public interface ThrowExceptionFunction {
    /**
     * 抛出异常的信息
     * @author zhangwenhao
     * @date 2022/6/6 11:10
     * @param message -- 抛出异常的信息
     */
    void throwMessage(String message);
}
