package com.java.study.observerpattern.spring.pojo;

/**
 * 支付实体类
 *
 * @author zhangwenhao
 * @date 2022-04-02 15:30
 */
public class PaymentInfo {
    /**
     * 支付id
     */
    private int id;

    /**
     * 支付状态
     */
    private String status;

    public final int getId() {
        return id;
    }

    public final void setId(int id) {
        this.id = id;
    }

    public final String getStatus() {
        return status;
    }

    public final void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "PaymentInfo{" +
                "id=" + id +
                ", status='" + status + '\'' +
                '}';
    }
}
