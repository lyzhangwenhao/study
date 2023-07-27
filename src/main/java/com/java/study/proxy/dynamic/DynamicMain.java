package com.java.study.proxy.dynamic;

import com.java.study.proxy.ObtainInfo;
import com.java.study.proxy.SendMessage;
import com.java.study.proxy.dynamic.handler.MyInvocationHandler;
import com.java.study.proxy.dynamic.interceptor.MyMethodIntgerceptor;
import com.java.study.proxy.impl.ObtainInfoImplAnimal;
import com.java.study.proxy.impl.ObtainInfoImplPerson;
import com.java.study.proxy.impl.SendMessageImplDtalk;
import com.java.study.proxy.impl.SendMessageImplWechat;
import org.aspectj.weaver.ast.Var;
import org.springframework.cglib.core.DebuggingClassWriter;
import org.springframework.cglib.proxy.Enhancer;

import java.io.File;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;

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
//        method4();
//        method5();
        method6();
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
//        List<String> list = new ArrayList<>();
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
        list.add("");

        list.forEach(s -> {
            list.add("str");
        });
        list.forEach(System.out::println);
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            // 不支持迭代器删除
            // iterator.remove();
        }
        BigDecimal bigDecimal = new BigDecimal(Double.toString(10.0));
        BigDecimal bigDecimal1 = new BigDecimal(Double.toString(3.0));
        System.out.println(bigDecimal);
        System.out.println(bigDecimal.divide(bigDecimal1, 10, 4));


    }
    public static void method5() {
        List<String> list = new ArrayList<>();
        List<String> list1 = list;
        List<String> list2 = list;
        List<String> list3 = list;
        list.add("1");
        System.out.println(list);
        System.out.println(list1);
        System.out.println(list2);
        System.out.println(list3);

    }
    public static void method6() {
        List<Student> stuList = new ArrayList<>();
        stuList.add(new Student("1", "张三"));
        stuList.add(new Student("2", "李四"));
        stuList.add(new Student("3", "王五"));
        stuList.add(new Student("4", "赵六"));
        stuList.add(new Student("5", "田七"));

        Map<String, String> stuMap = stuList.stream().collect(Collectors.toMap(Student::getId, Student::getName));
        System.out.println(stuMap);
    }

}

class Student{
    private String id;
    private String name;

    public Student() {
    }

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public final void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public final void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}