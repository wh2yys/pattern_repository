package com.wh2yys.pattern.proxypattern.staticproxy.demo2;

/**
 * @ClassName Order
 * @Description TODO
 * @Author wh2yys
 * @Date 2019/8/22 17:18
 */
public class Order {
    private Object orderInfo;
    private Long createTime;
    private String id;

    public Object getOrderInfo() {
        return orderInfo;
    }

    public void setOrderInfo(Object orderInfo) {
        this.orderInfo = orderInfo;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
