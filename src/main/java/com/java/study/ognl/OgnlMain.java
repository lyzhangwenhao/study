package com.java.study.ognl;

import com.java.study.pojo.Address;
import com.java.study.pojo.User;
import ognl.Ognl;
import ognl.OgnlException;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhangwenhao
 * @Description
 * @date 2022/03/22/09:54
 */
public class OgnlMain {
    public static void main(String[] args) throws OgnlException {
        User user = new User();
        user.setName("张三");
        user.setAge(18);
        user.setPassword("123456789");
        user.setDescription("男的");

        Address address = new Address();
        address.setCountry("中国");
        address.setProvince("河南");
        address.setCity("周口");
        address.setDetails("鹿邑县任集乡");

        user.setAddress(address);
        System.out.println(Ognl.getValue("name", user));
        System.out.println(Ognl.getValue("address.city", user));
        System.out.println("-----");
        List<String> list = new ArrayList<>();


    }
}
