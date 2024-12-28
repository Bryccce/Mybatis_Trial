package com.mybatis.mapper;

import com.mybatis.utils.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

public class OrderMapperTest {
    private SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtils.generateSqlSessionFactory();
    @Test
    public void findOrderAndUser() {
        sqlSessionFactory.openSession().getMapper(OrderMapper.class)
                .findOrderAndUser()
                .forEach(System.out::println);
    }
}