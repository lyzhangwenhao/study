package com.java.study.fastjson.impl;

import com.java.study.fastjson.Fruit;

import java.math.BigDecimal;

/**
 * 苹果实现类
 *
 * @author zhangwenhao
 * @date 2022-04-06 14:24
 */
public class Apple implements Fruit {
    private BigDecimal price;

    public final BigDecimal getPrice() {
        return price;
    }

    public final void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "price=" + price +
                '}';
    }
}
