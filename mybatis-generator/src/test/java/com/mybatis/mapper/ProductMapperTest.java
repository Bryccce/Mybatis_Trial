package com.mybatis.mapper;

import com.mybatis.po.ProductExample;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import utils.SqlSessionFactoryUtils;

import static org.junit.Assert.*;

public class ProductMapperTest {
    private SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtils.generateSqlSessionFactory();
    @Test
    public void selectByExample() {
        ProductExample pe = new ProductExample();
        ProductExample.Criteria criteria = pe.createCriteria();
        criteria.andPriceBetween(3000, 6000);
        sqlSessionFactory.openSession().getMapper(ProductMapper.class)
                .selectByExample(pe).forEach(System.out::println);
    }
}