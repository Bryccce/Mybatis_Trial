package com.mybatis.mapper;

import com.mybatis.Student;
import com.mybatis.vo.QueryVO;

import java.util.List;

public interface StudentMapper {
    List<Student> selectByCondition(QueryVO queryVO);
}
