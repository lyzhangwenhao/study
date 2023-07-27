package com.java.study;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * stream练习
 *
 * @author zhangwenhao
 * @date 2022-06-06 10:37
 */
@SpringBootTest
public class StreamTest {
    @Test
    public void method01() {
        // 判断整数是否是自然数
        Predicate<Integer> predicate1 = (p) -> p >= 0;
        // 判断整数的绝对值是否大于100
        Predicate<Integer> predicate2 = (p) -> Math.abs(p) > 50;
        // 判断整数是否是偶数
        Predicate<Integer> predicate3 = (p) -> p%2 == 0;

        List<Integer> list = new ArrayList<>();
        // 生成初始数据
        for (int i = -100; i < 100; i++) {
            list.add(i);
        }

        // 判断个数
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;

        for (Integer integer : list){
            // 自然数的个数
            if (predicate1.test(integer)) {
                System.out.println("自然数：" + integer);
                count1 ++;
            }
            // 负整数的个数
            if (predicate1.negate().test(integer)) {
                System.out.println("负整数：" + integer);
                count2 ++;
            }
            // 绝对值大于100的偶数个数
            if (predicate2.and(predicate3).test(integer)) {
                System.out.println("绝对值大于100的偶数：" + integer);
                count3 ++;
            }
            // 负整数或偶数个数
            if (predicate1.negate().or(predicate3).test(integer)) {
                System.out.println("负整数或偶数：" + integer);
                count4 ++;
            }
        }
        System.out.println(count1);
        System.out.println(count2);
        System.out.println(count3);
        System.out.println(count4);

    }
}
