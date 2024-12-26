package com.mybatis.mapper;

import com.mybatis.dao.impl.StudentDaoImplTest;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;

import static org.junit.Assert.*;

public class ProductMapperTest {
    private SqlSessionFactory sqlSessionFactory;

    @Before
    public void init(){
        InputStream is = StudentDaoImplTest.class.getClassLoader().getResourceAsStream("SqlMapConfig.xml");
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
    }

    @Test
    public void findByPid() {
        ProductMapper mapper = sqlSessionFactory.openSession().getMapper(ProductMapper.class);
        System.out.println(mapper.findByPid(7));
    }

    @Test
    public void findByCategory() {
        ProductMapper mapper = sqlSessionFactory.openSession().getMapper(ProductMapper.class);
        mapper.findByCategory("%女士%").forEach(System.out::println);
    }
}