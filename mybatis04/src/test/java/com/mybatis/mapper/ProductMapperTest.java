package com.mybatis.mapper;

import com.mybatis.po.Product;
import com.mybatis.utils.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.Assert.*;

public class ProductMapperTest {
    private SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtils.generateSqlSessionFactory();
    @org.junit.Test
    public void saveProduct() throws ParseException {
        Date date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2010-12-01 13:00:00");
        Timestamp timestamp = new Timestamp(date.getTime());
        SqlSession sqlSession = sqlSessionFactory.openSession();
        Product product = new Product("洗衣机", 3999, "进口洗衣机", null, timestamp);
        sqlSession.getMapper(ProductMapper.class)
                .saveProduct(product);
        sqlSession.commit();
    }
}