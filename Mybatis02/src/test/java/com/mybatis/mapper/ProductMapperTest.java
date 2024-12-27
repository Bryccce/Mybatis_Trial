package com.mybatis.mapper;

import com.mybatis.Product;
import com.mybatis.vo.QueryVO;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;

public class ProductMapperTest {
    private SqlSessionFactory sqlSessionFactory;

    @Before
    public void init(){
        InputStream is = ProductMapperTest.class.getClassLoader().getResourceAsStream("SqlMapConfig.xml");
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

    @Test
    public void findByCondition() {
        Product product = new Product();
        product.setCategory("笔记本");
        product.setPrice(5999);
        ProductMapper mapper = sqlSessionFactory.openSession().getMapper(ProductMapper.class);
        mapper.findByCondition(new QueryVO(product)).forEach(System.out::println);
    }
}