package com.mybatis.dao.impl;

import com.mybatis.po.Student;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;


import java.io.InputStream;

import static org.junit.Assert.*;

public class StudentDaoImplTest {
    private StudentDaoImpl studentDao;

    @Before
    public void init(){
        InputStream resourceAsStream = StudentDaoImplTest.class.getClassLoader().getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        studentDao = new StudentDaoImpl(sqlSessionFactory);
    }
    @Test
    public void findBySno() {
        System.out.println(studentDao.findBySno(201215151));
    }

    @Test
    public void findBySname() {
        studentDao.findBySname("%张%").forEach(System.out::println);
    }
}