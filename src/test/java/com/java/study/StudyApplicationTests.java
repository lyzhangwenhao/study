package com.java.study;

import com.java.study.aop.service.SendMessage;
import org.elasticsearch.client.IndicesClient;
import org.elasticsearch.client.RestHighLevelClient;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class StudyApplicationTests {

    @Autowired
    private SendMessage sendMessage;
    @Test
    void contextLoads() {
        System.out.println(sendMessage.send("张三", "李四", "你是谁？"));
    }

    @Autowired
    private RestHighLevelClient restHighLevelClient;

    @Test
    void test01(){
        IndicesClient indices = restHighLevelClient.indices();

    }

}
