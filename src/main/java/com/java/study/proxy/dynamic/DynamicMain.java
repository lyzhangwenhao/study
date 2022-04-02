package com.java.study.proxy.dynamic;

import com.java.study.proxy.ObtainInfo;
import com.java.study.proxy.SendMessage;
import com.java.study.proxy.dynamic.handler.MyInvocationHandler;
import com.java.study.proxy.dynamic.interceptor.MyMethodIntgerceptor;
import com.java.study.proxy.impl.ObtainInfoImplAnimal;
import com.java.study.proxy.impl.ObtainInfoImplPerson;
import com.java.study.proxy.impl.SendMessageImplDtalk;
import com.java.study.proxy.impl.SendMessageImplWechat;
import org.springframework.cglib.core.DebuggingClassWriter;
import org.springframework.cglib.proxy.Enhancer;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * @author zhangwenhao
 * @Description
 * @date 2022/03/20/16:17
 */
public class DynamicMain {
    public static void main(String[] args) {
//        method1();
//        method2();
//        method3();
        method4();
    }
    public static void method1(){
        SendMessage wechatMessage = new SendMessageImplWechat();
        MyInvocationHandler myInvocationHandler = new MyInvocationHandler();
        SendMessage wechatInstance = (SendMessage) myInvocationHandler.getInstance(wechatMessage);
        System.out.println(wechatInstance.sendMessage("张三", "李四", "消息内容"));

        System.out.println(wechatInstance.printLog("日志信息"));



        SendMessage dtalkMessage = new SendMessageImplDtalk();
        SendMessage dtalkInstance = (SendMessage) myInvocationHandler.getInstance(dtalkMessage);
        System.out.println(dtalkInstance.sendMessage("李四", "张三", "消息内容"));

        System.out.println(dtalkInstance.printLog("日志信息"));
    }
    public static void method2(){
        ObtainInfoImplPerson obtainInfoImplPerson = new ObtainInfoImplPerson();
        ObtainInfo personObtain = (ObtainInfo) new MyInvocationHandler().getInstance(obtainInfoImplPerson);
        System.out.println(personObtain.getName("1"));
        System.out.println(personObtain.getAddress("1"));

        ObtainInfo obtainInfoImplAnimal = new ObtainInfoImplAnimal();
        ObtainInfo animalInstance = (ObtainInfo) new MyInvocationHandler().getInstance(obtainInfoImplAnimal);
        System.out.println(animalInstance.getName("2"));
        System.out.println(animalInstance.getAddress("2"));

    }

    /**
     * @Description cglib动态代理
     * @Author zhangwenhao
     * @Date 2022/3/31 17:31
     * @Param []
     * return void
     */
    public static void method3(){
        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "/Users/zhangwenhao/Desktop");
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(SendMessageImplWechat.class);
        enhancer.setCallback(new MyMethodIntgerceptor());
        SendMessage sendMessage = (SendMessage) enhancer.create();
        System.out.println(sendMessage.sendMessage("张三", "李四", "消息内容"));

    }


    public static void method4(){
//        Lock
        /**
         * 110
         * 11
         */
        System.out.println(10 >> 1);
        List<String> list = new ArrayList<>();
        list.add("");

    }
}
