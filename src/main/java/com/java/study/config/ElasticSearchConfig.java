//package com.java.study.config;
//
//import org.apache.commons.lang3.StringUtils;
//import org.apache.http.HttpHost;
//import org.apache.http.auth.AuthScope;
//import org.apache.http.auth.UsernamePasswordCredentials;
//import org.apache.http.impl.client.BasicCredentialsProvider;
//import org.elasticsearch.client.RestClient;
//import org.elasticsearch.client.RestClientBuilder;
//import org.elasticsearch.client.RestHighLevelClient;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import java.util.Arrays;
//
///**
// * ElasticSearch配置
// *
// * @author zhangwenhao
// * @date 2022-05-12 10:14
// */
//@Configuration
//public class ElasticSearchConfig {
//    /**
//     * es集群地址
//     */
////    @Value("${spring.elasticsearch.uris}")
//    private String[] uris;
//
//    /**
//     * 用户名
//     */
////    @Value("${spring.elasticsearch.username}")
//    private String username;
//
//    /**
//     * 密码
//     */
////    @Value("${spring.elasticsearch.password}")
//    private String password;
//
//    /**
//     * 套接字超时时间（默认30秒）
//     */
////    @Value("${spring.elasticsearch.socket-timeout}")
//    private Integer socketTimeout = 30;
//
//    /**
//     * 连接超时时间（默认1秒）
//     */
////    @Value("${spring.elasticsearch.connect-timeout}")
//    private Integer connectTimeout = 1;
//
//    @Bean(name = "restHighLevelClient")
//    public RestHighLevelClient elasticsearchClient() {
////        HttpHost[] httpHosts = Arrays.stream(uris).map(HttpHost::create).toArray(HttpHost[]::new);
//        RestClientBuilder builder = RestClient.builder(new HttpHost("127.0.0.1", 9200)).setRequestConfigCallback(requestConfigBuilder -> requestConfigBuilder.setConnectTimeout(connectTimeout)
//                .setSocketTimeout(socketTimeout));
//        // 存在账号密码时设置账号密码
//        if (StringUtils.isNotBlank(username) && StringUtils.isNotBlank(password)){
//            BasicCredentialsProvider basicCredentialsProvider = new BasicCredentialsProvider();
//            basicCredentialsProvider.setCredentials(AuthScope.ANY, new UsernamePasswordCredentials(username,password));
//            builder.setHttpClientConfigCallback(httpAsyncClientBuilder -> httpAsyncClientBuilder.setDefaultCredentialsProvider(basicCredentialsProvider));
//        }
//        return new RestHighLevelClient(builder);
//    }
//
//    public final String[] getUris() {
//        return uris;
//    }
//
//    public final void setUris(String[] uris) {
//        this.uris = uris;
//    }
//
//    public final String getUsername() {
//        return username;
//    }
//
//    public final void setUsername(String username) {
//        this.username = username;
//    }
//
//    public final String getPassword() {
//        return password;
//    }
//
//    public final void setPassword(String password) {
//        this.password = password;
//    }
//}
