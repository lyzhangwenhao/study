package com.java.study.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * lambda测试
 *
 * @author zhangwenhao
 * @date 2022-11-22 10:08
 */
public class LambdaTest {
    public static void main(String[] args) {
        List<User> list = new ArrayList<>();
        list.add(new User("张三", "河南省", 17, "男"));
        list.add(new User("李四", "河南省", 29, "男"));
        list.add(new User("王五", "浙江省", 29, "女"));
        list.add(new User("赵六", "辽宁省", 20, "男"));
        list.add(new User("冯七", "辽宁省", 12, "女"));

        Map<String, List<User>> result = list.stream().collect(Collectors.groupingBy(User::getAddress));
        result.forEach((k, v) -> {
            System.out.println(k + ":" + v.toString());
        });

    }
}
class User{
    private String name;

    private String address;

    private int age;

    private String sex;

    public User(String name, String address, int age, String sex) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.sex = sex;
    }

    public final String getName() {
        return name;
    }

    public final void setName(String name) {
        this.name = name;
    }

    public final String getAddress() {
        return address;
    }

    public final void setAddress(String address) {
        this.address = address;
    }

    public final int getAge() {
        return age;
    }

    public final void setAge(int age) {
        this.age = age;
    }

    public final String getSex() {
        return sex;
    }

    public final void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }
}