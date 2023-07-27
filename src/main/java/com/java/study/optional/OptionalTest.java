package com.java.study.optional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * Optional学习使用
 *
 * @author zhangwenhao
 * @date 2022-05-28 21:24
 */
public class OptionalTest {
    public static void main(String[] args) {
        List<String> list = null;
        Optional.ofNullable(list).ifPresent(l->{
            l = new ArrayList<>();
            l.add("zhangsan");
            l.add("lisi");
        });
        System.out.println(Arrays.toString(list.toArray()));
    }
}
