package com.java.study.aop;

import com.java.study.aop.service.SendMessage;
import com.java.study.aop.service.impl.SendMessageImpl;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * aop测试
 *
 * @author zhangwenhao
 * @date 2022-04-06 15:41
 */
public class MainTest {
    public static void main(String[] args) {
//        SendMessage sendMessage = new SendMessageImpl();
//        System.out.println(sendMessage.send("张三", "李四", "你是谁？"));
        //普通的正则测试，适用于多次使用
        Pattern p = Pattern.compile("^a[bcd]{2,4}-\\d*$");
        Matcher m = p.matcher("bbc-123");
        boolean b = m.matches();
        System.out.println(b);

        //简短的正则表达式，单次使用。
        boolean b2 = Pattern.matches("^a[bcd]{2,4}-\\d*$", "abbc-123");
        System.out.println(b2);

    }
}
