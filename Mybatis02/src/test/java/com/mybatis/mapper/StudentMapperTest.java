package com.mybatis.mapper;

import com.mybatis.Student;
import com.mybatis.vo.QueryVO;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;

public class StudentMapperTest {
    private SqlSessionFactory sqlSessionFactory;

    @Before
    public void init(){
        InputStream is = StudentMapperTest.class.getClassLoader().getResourceAsStream("SqlMapConfig.xml");
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
    }
    @Test
    public void selectByCondition() {
        Student student = new Student();
        student.setSname("张");
        //student.setSgender("女");
        sqlSessionFactory.openSession().getMapper(StudentMapper.class)
                .selectByCondition(new QueryVO(student))
                .forEach(System.out::println);
    }
}