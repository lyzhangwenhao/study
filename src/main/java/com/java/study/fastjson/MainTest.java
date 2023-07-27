package com.java.study.fastjson;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.java.study.fastjson.impl.Apple;

import java.math.BigDecimal;

/**
 * fastjson测试
 *
 * @author zhangwenhao
 * @date 2022-04-06 14:26
 */
public class MainTest {
    public static void main(String[] args) {
        Store store = new Store();
        store.setName("苹果");

        Apple apple = new Apple();
        apple.setPrice(new BigDecimal("3.7"));
        store.setFruit(apple);
        String str = JSON.toJSONString(store, SerializerFeature.WriteClassName);
        System.out.println(str);

        Store store1 = parseObject(str);

    }

    public static Store parseObject(String str){
        Store store = JSON.parseObject(str, Store.class);
        System.out.println("store:" + store);
        System.out.println("store:" + store.toString());

        Fruit fruit = store.getFruit();
        System.out.println("fruit:" + fruit);

        Apple apple = (Apple) store.getFruit();
        System.out.println("apple:" + apple);
        return store;
    }
}
