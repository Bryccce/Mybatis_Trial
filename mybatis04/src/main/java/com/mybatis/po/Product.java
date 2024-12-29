package com.mybatis.po;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class Product {

    private Integer id;
    /**
    * 商品名称
    */
    private String name;
    /**
    * 商品定价
    */
    private double price;
    /**
    * 商品描述
    */
    private String detail;
    /**
    * 商品图片
    */
    private String pic;
    /**
    * 生产日期
    */
    private Timestamp createtime;

    public Product(String name, double price, String detail, String pic, Timestamp createtime) {
        this.name = name;
        this.price = price;
        this.detail = detail;
        this.pic = pic;
        this.createtime = createtime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public Timestamp getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Timestamp createtime) {
        this.createtime = createtime;
    }

}