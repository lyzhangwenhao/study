package com.java.study.proxy.impl;

import com.java.study.proxy.ObtainInfo;

/**
 * @author zhangwenhao
 * @Description
 * @date 2022/03/20/17:47
 */
public class ObtainInfoImplAnimal implements ObtainInfo {
    @Override
    public String getName(String id) {
        System.out.println("获取动物名称id：" + id + "信息");
        return "name" + id;
    }

    @Override
    public String getAddress(String id) {
        System.out.println("获取动物地址id：" + id + "信息");
        return "address" + id;
    }
}
