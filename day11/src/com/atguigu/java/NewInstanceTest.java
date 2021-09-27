package com.atguigu.java;

import org.junit.Test;

/**
 * @Author Tang YouLong
 * @Date 2021/9/27 12:36
 * @Version V1.0
 * @ClassName NewInstanceTest
 * @Description TODO:
 *
 * 通过反射创建对应的运行时类的对象
 *
 */
public class NewInstanceTest {

    @Test
    public void test1() throws InstantiationException, IllegalAccessException {

        Class<Person> clazz = Person.class;
        /*
        newInstance():调用此方法，创建对应的运行时类的对象
         */
        Person obj = clazz.newInstance();
        System.out.println(obj);


    }
}
