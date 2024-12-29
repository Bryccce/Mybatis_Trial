package com.mybatis.mapper;

import com.mybatis.po.Order;
import com.mybatis.po.User;
import com.mybatis.utils.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class UserMapperTest {
    SqlSessionFactory sqlFactory = SqlSessionFactoryUtils.generateSqlSessionFactory();
    @Test
    public void findAllLazy() {
        List<User> users = sqlFactory.openSession()
                .getMapper(UserMapper.class)
                .findAllLazy();
        for (User user : users) {
            System.out.println(user.getId()+" "+user.getUsername());
            if (user.getOrders().size()>0) {
//当获取订单信息的时候,会查询订单表
                System.out.println(user.getOrders().get(0).getId());
//当获取订单明细的时候,会查询订单明细表
//当获取商品信息的时候,会查询商品表
                System.out.println(user.getOrders().get(0).getOrderDetails());
            }
        }
    }
}