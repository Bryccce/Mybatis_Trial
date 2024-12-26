package com.mybatis.dao.impl;

import com.mybatis.dao.StudentDao;
import com.mybatis.po.Student;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public class StudentDaoImpl implements StudentDao {
    private SqlSessionFactory sqlSessionFactory;

    public StudentDaoImpl(SqlSessionFactory sqlSessionFactory) {
        this.sqlSessionFactory = sqlSessionFactory;
    }

    @Override
    public Student findBySno(int sno) {
        return sqlSessionFactory.openSession().selectOne("test.findBySno", sno);
    }

    @Override
    public List<Student> findBySname(String sname) {
        return sqlSessionFactory.openSession().selectList("test.findBySname", sname);
    }
}
