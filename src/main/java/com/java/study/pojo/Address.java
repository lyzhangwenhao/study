package com.java.study.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author zhangwenhao
 * @Description
 * @date 2022/03/22/09:56
 */
@Setter
@Getter
@ToString
public class Address {
    private String country;

    private String province;

    private String city;
    
    private String details;

}
