package com.java.study.fastjson;

/**
 * 仓库类测试
 *
 * @author zhangwenhao
 * @date 2022-04-06 14:23
 */
public class Store {
    /**
     * 名称
     */
    private String name;

    /**
     * 水果
     */
    private Fruit fruit;

    public final String getName() {
        return name;
    }

    public final void setName(String name) {
        this.name = name;
    }

    public final Fruit getFruit() {
        return fruit;
    }

    public final void setFruit(Fruit fruit) {
        this.fruit = fruit;
    }

    @Override
    public String toString() {
        return "Store{" +
                "name='" + name + '\'' +
                ", fruit=" + fruit +
                '}';
    }
}
