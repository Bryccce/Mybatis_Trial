import model.Student;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

public class MybatisDemo01 {

    @Test
    public void testFindBySno(){
        InputStream resourceAsStream = MybatisDemo01.class.getClassLoader().getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        Student student = sqlSession.selectOne("test.findBySno", 201215121);
        System.out.println(student);
        sqlSession.close();
    }

    @Test
    public void testFindBySname(){
        InputStream resourceAsStream = MybatisDemo01.class.getClassLoader().getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        sqlSession.selectList("test.findBySname", "%李%").forEach(System.out::println);
        sqlSession.close();
    }

    @Test
    public void testInsertStudent(){
        InputStream resourceAsStream = MybatisDemo01.class.getClassLoader().getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        try {
            Date sbirthday = new Date(new SimpleDateFormat("yyyy-MMdd").parse("1996-10-12").getTime());
            Student student = new Student("Issy", "女", sbirthday);
            sqlSession.insert("test.insertStudent", student);
            sqlSession.commit();
            System.out.println(student);
        } catch (ParseException e) {
            sqlSession.rollback();
            throw new RuntimeException(e);
        }
    }

    @Test
    public void testUpateStudent() {
        InputStream is = MybatisDemo01.class.getClassLoader().getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        try {
            sqlSession.update("test.updateStudent",
                    new Student(201312346, "周芷若", "女",
                            new Date(new SimpleDateFormat("yyyy-MM-dd").
                                    parse("1995-10-10").getTime())));
            sqlSession.commit();
        } catch (Exception e) {
            sqlSession.rollback();
            e.printStackTrace();
        } finally {
            sqlSession.close();
        }
    }
    @Test
    public void deleteStudent(){
        InputStream resourceAsStream = MybatisDemo01.class.getClassLoader().getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        try {
            sqlSession.delete("test.deleteStudent", 201312346);
            sqlSession.commit();
        }catch (Exception e){
            sqlSession.rollback();
            e.printStackTrace();
        }finally {
            sqlSession.close();
        }
    }
}
