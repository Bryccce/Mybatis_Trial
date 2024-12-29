package com.mybatis.mapper;

import com.mybatis.po.Product;

public interface ProductMapper {
    Product findByProductId(int pid);
}
