package com.mybatis.vo;

import com.mybatis.Product;
import com.mybatis.Student;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class QueryVO {
    private Product product;
    private Student student;

    public QueryVO(Product product) {
        this.product = product;
    }

    public QueryVO(Student student) {
        this.student = student;
    }
}
