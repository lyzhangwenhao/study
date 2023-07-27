package com.bugu.test;

import com.alibaba.fastjson.JSON;
import com.bugu.dto.UtpProductInfoDTO;

import java.util.*;
import java.util.stream.Collectors;

/**
 * 产品数据生成
 *
 * @author zhangwenhao
 * @date 2023-05-31 10:41
 */
public class ProductTest {
    public static void main(String[] args) {
        List< UtpProductInfoDTO> list = initProductList();
        List<Map<String, Object>> transformedList = list.stream()
                .collect(Collectors.groupingBy(UtpProductInfoDTO::getProductTypeFirst))
                .entrySet().stream()
                .map(entry -> {
                    Map<String, Object> firstTypeMap = new HashMap<>();
                    firstTypeMap.put("name", entry.getKey());
                    firstTypeMap.put("list", entry.getValue().stream()
                            .collect(Collectors.groupingBy(UtpProductInfoDTO::getProductTypeSecond))
                            .entrySet().stream()
                            .map(secondEntry -> {
                                Map<String, Object> secondTypeMap = new HashMap<>();
                                secondTypeMap.put("name", secondEntry.getKey());
                                secondTypeMap.put("list", secondEntry.getValue().stream()
                                        .collect(Collectors.groupingBy(UtpProductInfoDTO::getProductTypeThird))
                                        .entrySet().stream()
                                        .map(thirdEntry -> {
                                            Map<String, Object> thirdTypeMap = new HashMap<>();
                                            thirdTypeMap.put("name", thirdEntry.getKey());
                                            thirdTypeMap.put("list", thirdEntry.getValue());
                                            return thirdTypeMap;
                                        })
                                        .collect(Collectors.toList()));
                                return secondTypeMap;
                            })
                            .collect(Collectors.toList()));
                    return firstTypeMap;
                })
                .collect(Collectors.toList());

        System.out.println(JSON.toJSONString(transformedList));
    }

    public static List< UtpProductInfoDTO> initProductList() {
        List< UtpProductInfoDTO> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            String firstType = i%4 == 0 ? "云基础技术中台" : i%4 == 1 ? "数据中台" : i%4 == 2 ? "AI中台" : "解决方案";
            String secondType = "二级分类" + (i%10 + 1);
            String thirdType = "三级分类" + (i%10 + 1);
            list.add(new UtpProductInfoDTO("产品ID", "产品编码", "产品名称", "产品简称", "产品标签", firstType, secondType, thirdType, "产品负责人", "产品负责人工号", "发布标志", "产品状态", "产品描述", "产品优先级", "产品所属部门ID", "产品所属部门名称", "产品测试地址", "产品logo地址", "产品图片地址", "首次发布时间", "最新版本", "创建人", new Date(), "更新人", new Date()));
        }
        return list;
    }
}
