package com.java.study.function.isblank;

import java.util.function.Consumer;

/**
 * 空值与非空分支处理
 *
 * @author zhangwenhao
 * @date 2022-06-06 11:37
 */
public interface PresentOrElseHandler<T> {
    /**
     * 根据传入的值判断，为空和非空时执行相应的操作
     * @author zhangwenhao
     * @date 2022/6/6 11:39
     * @param action -- 值不为空时执行的操作
     * @param emptyAction -- 值为空时执行的操作
     */
    void presentOrElseHandle(Consumer<? super T> action, Runnable emptyAction);
}
