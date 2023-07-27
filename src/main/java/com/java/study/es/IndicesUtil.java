package com.java.study.es;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.elasticsearch.ElasticsearchStatusException;
import org.elasticsearch.action.admin.indices.delete.DeleteIndexRequest;
import org.elasticsearch.action.support.master.AcknowledgedResponse;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.client.indices.CreateIndexRequest;
import org.elasticsearch.client.indices.CreateIndexResponse;
import org.elasticsearch.client.indices.GetIndexRequest;
import org.elasticsearch.client.indices.GetIndexResponse;

import java.io.IOException;

/**
 * @author zhangwenhao
 * @Description
 * @date 2021/05/24/16:42
 */
public class IndicesUtil {
    private static final Logger logger = LogManager.getLogger(IndicesUtil.class);

    /**
     * @Description 删除指定索引
     * @Author zhangwenhao
     * @Date 2021/5/25 10:32
     * @Param [client, indices]
     * return org.elasticsearch.action.support.master.AcknowledgedResponse
     */
    public static AcknowledgedResponse deleteIndex(RestHighLevelClient client, String... indices){
        AcknowledgedResponse response = null;
        try {
            DeleteIndexRequest request = new DeleteIndexRequest(indices);
            response = client.indices().delete(request, RequestOptions.DEFAULT);
        } catch (IOException e) {
            logger.error("fail to delete:{}",e.getMessage());
        }
        return response;
    }

    /**
     * @Description 获取指定索引
     * @Author zhangwenhao
     * @Date 2021/5/25 10:24
     * @Param [client, index]
     * return org.elasticsearch.client.indices.getIndex
     */
    public static GetIndexResponse getIndex(RestHighLevelClient client, String... indices){
        GetIndexResponse response = null;
        try {
            GetIndexRequest request = new GetIndexRequest(indices);
            response = client.indices().get(request, RequestOptions.DEFAULT);
        } catch (Exception e){
            logger.error("fail to get:{}",e.getMessage());
        }
        return response;
    }

    /**
     * @Description 创建索引
     * @Author zhangwenhao
     * @Date 2021/5/25 10:23
     * @Param [client, index]
     * return org.elasticsearch.client.indices.CreateIndexResponse
     */
    public static CreateIndexResponse createIndex(RestHighLevelClient client, String index){
        CreateIndexRequest request = new CreateIndexRequest(index);
        // 默认失败的response
        CreateIndexResponse response = new CreateIndexResponse(false,false,index);
        try {
            response = client.indices().create(request, RequestOptions.DEFAULT);
        } catch (ElasticsearchStatusException e){
            logger.error("Index already exists:{}",e.getMessage());
        } catch (IOException e) {
            logger.error("Index creation failed:{}",e.getMessage());
        }
        return response;
    }
}
