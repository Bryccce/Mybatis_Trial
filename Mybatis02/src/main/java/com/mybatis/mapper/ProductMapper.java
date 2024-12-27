package com.mybatis.mapper;

import com.mybatis.Product;
import com.mybatis.vo.QueryVO;

import java.util.HashMap;
import java.util.List;

public interface ProductMapper {
    Product findByPid(int pid);

    List<Product> findByCategory(String category);

    List<Product> findByCondition(QueryVO queryVO);

    List<Product> selectByMap(HashMap<String, Object> map);
}
