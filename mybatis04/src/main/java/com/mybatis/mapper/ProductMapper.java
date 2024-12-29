package com.mybatis.mapper;

import com.mybatis.po.Product;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.SelectKey;

public interface ProductMapper {
    @SelectKey(keyProperty = "id", keyColumn = "id", resultType = int.class, statement = "SELECT LAST_INSERT_ID()",
    before = false)
    @Insert("Insert Into mybatis03.product(name, price, detail, pic, createtime) VALUES " +
    "(#{name}, #{price}, #{detail}, #{pic}, #{createtime})")
    void saveProduct(Product product);
}
