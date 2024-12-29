package com.mybatis.mapper;

import com.mybatis.po.User;

import java.util.List;

public interface UserMapper {
    List<User> findAll();
}