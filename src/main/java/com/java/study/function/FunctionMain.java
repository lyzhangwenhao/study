package com.java.study.function;

import com.alibaba.fastjson.JSONObject;
import com.java.study.function.util.FunctionUtil;
import org.apache.http.NameValuePair;
import org.apache.http.client.utils.URLEncodedUtils;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.function.Consumer;

/**
 * Function测试
 *
 * @author zhangwenhao
 * @date 2022-06-06 11:17
 */
public class FunctionMain {
    public static void main(String[] args) throws Exception{
//        method01();
//        method02();
//        method03();
//        method04();
        method05();
    }

    public static void method05() throws UnsupportedEncodingException {
        String url = "http://172.21.66.182:9000/monitor-monitor-monitor-center/监控视图-主机看板推送-2022-06-10 19:03:00.html";
        List<NameValuePair> parse = URLEncodedUtils.parse(url, StandardCharsets.UTF_8);


        String encode = URLEncoder.encode("", StandardCharsets.UTF_8.toString());
        System.out.println(encode);
    }

    public static void method04(){
        JSONObject jsonObject = JSONObject.parseObject("");
        System.out.println(jsonObject.get("code"));
    }

    public static void method03() {
        FunctionUtil.isBlankOrNoBlank("hello").presentOrElseHandle((Consumer<Object>) o -> {
            System.out.println(o.toString());
        }, () -> {
            System.out.println("空字符串");
        });
    }

    public static void method02() {
        FunctionUtil.isTrueOrFalse(false).trueOrFalseHandle(() ->{
            System.out.println("if为true需要做的操作");
        },() -> {
            System.out.println("if为false需要做的操作");
        });
    }

    /**
     * 抛出异常判断测试
     * @author zhangwenhao
     * @date 2022/6/6 11:26
     */
    public static void method01() {
        FunctionUtil.isTrue(false).throwMessage("条件为False，抛出异常");
        System.out.println("......");
        FunctionUtil.isTrue(true).throwMessage("条件为False，抛出异常");
    }
}
