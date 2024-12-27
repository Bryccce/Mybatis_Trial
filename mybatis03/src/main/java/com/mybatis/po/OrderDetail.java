package com.mybatis.po;


public class OrderDetail {
    /**
    * 订单id
    */
    private Integer orderId;
    /**
    * 商品id
    */
    private Integer productId;
    /**
    * 商品购买数量
    */
    private Integer productNum;
 

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getProductNum() {
        return productNum;
    }

    public void setProductNum(Integer productNum) {
        this.productNum = productNum;
    }

    
}