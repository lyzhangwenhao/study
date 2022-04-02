package com.java.study.proxy.staticagent;

import com.java.study.proxy.impl.SendMessageImplDtalk;
import com.java.study.proxy.impl.SendMessageImplEmail;
import com.java.study.proxy.impl.SendMessageImplSms;
import com.java.study.proxy.impl.SendMessageImplWechat;
import com.java.study.proxy.staticagent.proxy.SendMessageProxy;

/**
 * @author zhangwenhao
 * @Description
 * @date 2022/03/20/16:57
 */
public class StaticMain {
    public static void main(String[] args) {
        System.out.println(new SendMessageProxy(new SendMessageImplEmail()).sendMessage("张三", "李四", "消息"));
        System.out.println(new SendMessageProxy(new SendMessageImplSms()).sendMessage("张三", "李四", "消息"));
        System.out.println(new SendMessageProxy(new SendMessageImplWechat()).sendMessage("张三", "李四", "消息"));
        System.out.println("=======================================");

        System.out.println(new SendMessageProxy(new SendMessageImplWechat()).printLog("日志信息"));
        System.out.println(new SendMessageProxy(new SendMessageImplDtalk()).printLog("日志信息"));
    }
}
