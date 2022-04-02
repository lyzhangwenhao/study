package com.java.study.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author zhangwenhao
 * @Description
 * @date 2022/03/22/09:55
 */
@Setter
@Getter
@ToString
public class User {
    private String name;

    private String password;

    private int age;

    private String description;

    private Address address;
}
