package com.bugu.test;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author zhangwenhao
 * @date 2023-06-09 17:19
 */
public class StreamTest {
    public static void main(String[] args) {
        // 创建示例对象列表
        List<Item> items = new ArrayList<>();
        items.add(new Item("Category1", "Subcategory1", "Subsubcategory1", 10));
        items.add(new Item("Category1", "Subcategory1", "Subsubcategory2", 15));
        items.add(new Item("Category1", "Subcategory2", "Subsubcategory3", 20));
        items.add(new Item("Category2", "Subcategory3", "Subsubcategory1", 5));
        items.add(new Item("Category2", "Subcategory3", "Subsubcategory2", 8));
        items.add(new Item("Category2", "Subcategory4", "Subsubcategory3", 12));

        // 使用Stream流进行三级分类和汇总
        Map<String, Map<String, Map<String, Integer>>> summary = items.stream()
                .collect(
                        Collectors.groupingBy(Item::getCategory, // 第一级分类
                                Collectors.groupingBy(Item::getSubcategory, // 第二级分类
                                        Collectors.groupingBy(Item::getSubsubcategory, // 第三级分类
                                                Collectors.summingInt(Item::getQuantity))))); // 汇总数量

        System.out.println(JSON.toJSONString(summary));
//        // 输出结果
//        for (Map.Entry<String, Map<String, Map<String, Integer>>> categoryEntry : summary.entrySet()) {
//            String category = categoryEntry.getKey();
//            System.out.println("Category: " + category);
//
//            Map<String, Map<String, Integer>> subcategoryMap = categoryEntry.getValue();
//            for (Map.Entry<String, Map<String, Integer>> subcategoryEntry : subcategoryMap.entrySet()) {
//                String subcategory = subcategoryEntry.getKey();
//                System.out.println("\tSubcategory: " + subcategory);
//
//                Map<String, Integer> subsubcategoryMap = subcategoryEntry.getValue();
//                for (Map.Entry<String, Integer> subsubcategoryEntry : subsubcategoryMap.entrySet()) {
//                    String subsubcategory = subsubcategoryEntry.getKey();
//                    int quantity = subsubcategoryEntry.getValue();
//                    System.out.println("\t\tSubsubcategory: " + subsubcategory + ", Quantity: " + quantity);
//                }
//            }
//        }
    }
}
class Item {
    private String category;
    private String subcategory;
    private String subsubcategory;
    private int quantity;

    public Item(String category, String subcategory, String subsubcategory, int quantity) {
        this.category = category;
        this.subcategory = subcategory;
        this.subsubcategory = subsubcategory;
        this.quantity = quantity;
    }

    public String getCategory() {
        return category;
    }

    public String getSubcategory() {
        return subcategory;
    }

    public String getSubsubcategory() {
        return subsubcategory;
    }

    public int getQuantity() {
        return quantity;
    }
}