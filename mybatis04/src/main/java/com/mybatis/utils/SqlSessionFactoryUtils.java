package com.mybatis.utils;

import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

public class SqlSessionFactoryUtils {
    private SqlSessionFactoryUtils(){}

    public static SqlSessionFactory generateSqlSessionFactory(){
        InputStream is = SqlSessionFactoryUtils.class.getClassLoader().getResourceAsStream("SqlMapConfig.xml");
        return new SqlSessionFactoryBuilder().build(is);
    }
}
