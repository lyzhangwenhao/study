package com.java.study.function.util;

import com.java.study.function.branch.BranchHandle;
import com.java.study.function.isblank.PresentOrElseHandler;
import com.java.study.function.throwexception.ThrowExceptionFunction;

/**
 * 处理if...else...的使用工具
 *
 * @author zhangwenhao
 * @date 2022-06-06 11:11
 */
public class FunctionUtil {

    /**
     * 判断为true时抛出异常
     * @author zhangwenhao
     * @date 2022/6/6 11:23
     * @param isTrue --
     * @return com.java.study.function.throwexception.ThrowExceptionFunction
     */
    public static ThrowExceptionFunction isTrue(boolean isTrue) {
        return (message -> {
            if (isTrue) {
                throw new RuntimeException(message);
            }
        });
    }

    /**
     * if分支处理
     * @author zhangwenhao
     * @date 2022/6/6 11:24 
     * @param isTrue -- 是否为true
     * @return com.java.study.function.branch.BranchHandle
     */
    public static BranchHandle isTrueOrFalse(boolean isTrue) {
        return ((trueRunnable, falseRunnable) -> {
            if (isTrue) {
                trueRunnable.run();
            } else {
                falseRunnable.run();
            }
        });
    }

    /**
     * 值不为空时，消费
     * 值为空时，做相应的操作
     * @author zhangwenhao
     * @date 2022/6/6 14:09
     * @param str --
     * @return com.java.study.function.isblank.PresentOrElseHandler<?>
     */
    public static PresentOrElseHandler<?> isBlankOrNoBlank(String str) {
        return (consumer, runnable) -> {
            if (str == null || str.length() == 0) {
                runnable.run();
            } else {
                consumer.accept(str);
            }
        };
    }

}
