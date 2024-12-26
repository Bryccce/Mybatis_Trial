package com.mybatis.mapper;

import com.mybatis.po.Product;

import java.util.List;

public interface ProductMapper {
    Product findByPid(int pid);

    List<Product> findByCategory(String category);
}
