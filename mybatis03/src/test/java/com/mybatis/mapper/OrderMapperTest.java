package com.mybatis.mapper;

import com.mybatis.po.Order;
import com.mybatis.utils.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

import java.util.List;

public class OrderMapperTest {
//    private SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtils.generateSqlSessionFactory();
//    @Test
//    public void findOrderAndUser() {
//        sqlSessionFactory.openSession().getMapper(OrderMapper.class)
//                .findOrderAndUser()
//                .forEach(System.out::println);
//    }
//
//    @Test
//    public void findOrdersAndOrderdetail() {
//        sqlSessionFactory.openSession().getMapper(OrderMapper.class)
//                .findOrdersAndOrderdetail()
//                .forEach(System.out::println);
//    }
//
//    @Test
//    public void findOrderAndUserLazy() {
//
//        List<Order> list = sqlSessionFactory.openSession().getMapper(OrderMapper.class).findOrderAndUserLazy();
//        for(Order order: list){
//            System.out.println(order.getUser().getUsername());
//        }
//
//    }
//
//    @Test
//    public void findOrdersAndOrderdetailLazy() {
//        List<Order> list = sqlSessionFactory.openSession().getMapper(OrderMapper.class).findOrdersAndOrderdetailLazy();
//        for(Order order : list){
//            System.out.println(order.getOrderDetails());
//            System.out.println("************");
//        }
//    }
}