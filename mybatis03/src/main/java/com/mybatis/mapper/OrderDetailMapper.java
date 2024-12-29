package com.mybatis.mapper;

import com.mybatis.po.OrderDetail;

public interface OrderDetailMapper {
    OrderDetail findOrderDetailById(int id);
}
