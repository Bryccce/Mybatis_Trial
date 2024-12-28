package com.mybatis.mapper;

import com.mybatis.po.Order;

import java.util.List;

public interface OrderMapper {
    List<Order> findOrderAndUser();

    List<Order> findOrdersAndOrderdetail();
}
