package com.java.study.spi;

import java.util.List;

/**
 * 搜索方式
 *
 * @author zhangwenhao
 * @date 2022-04-06 15:01
 */
public interface Search {
    /**
     * description: 搜索
     * @author zhangwenhao
     * @date 2022/4/6 15:02
     * @param keyWord -- 搜索关键字
     * @return java.util.List<java.lang.String>
     */
    public List<String> search(String keyWord);
}
