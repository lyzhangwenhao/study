package com.java.study.function.branch;

/**
 * 处理if...else...分支
 *
 * @author zhangwenhao
 * @date 2022-06-06 11:20
 */
@FunctionalInterface
public interface BranchHandle {
    /**
     * 处理if分支
     * @author zhangwenhao
     * @date 2022/6/6 11:21
     * @param trueRunnable -- 为true时需要做的处理
     * @param falseRunnable -- 为false时需要做的处理
     */
    void trueOrFalseHandle(Runnable trueRunnable, Runnable falseRunnable);
}
