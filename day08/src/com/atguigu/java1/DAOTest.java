package com.atguigu.java1;

import org.junit.Test;

import java.util.List;

/**
 * @Author TYL
 * @Date 2021/8/4 14:38
 * @Version V1.0
 * @ClassName DAOTest
 * @Description TODO:
 */
public class DAOTest {

    @Test
    public void test1(){
        CustomerDAO dao1 = new CustomerDAO();
        dao1.add(new Customer());
        List<Customer> list = dao1.getForList(10);

        StudentDAO dao2 = new StudentDAO();
    }
}
