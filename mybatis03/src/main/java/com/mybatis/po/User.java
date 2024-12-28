package com.mybatis.po;

import lombok.Data;

import java.sql.Date;
import java.util.List;
@Data
public class User {

    private Integer id;
    /**
    * 用户名称
    */
    private String username;
    /**
    * 生日
    */
    private Date birthday;
    /**
    * 性别
    */
    private String gender;
    /**
    * 地址
    */
    private String address;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

  
 
}