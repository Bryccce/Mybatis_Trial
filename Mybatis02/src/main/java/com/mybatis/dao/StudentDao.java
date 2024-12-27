package com.mybatis.dao;

import com.mybatis.Student;

import java.util.List;

public interface StudentDao {
    /**
     *
     * @param sno
     * @return
     */
    Student findBySno(int sno);

    List<Student> findBySname(String sname);
}
