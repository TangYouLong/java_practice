package com.atguigu.java2;

import org.junit.Test;

import java.util.List;

/**
 * @Author TYL
 * @Date 2021/8/4 15:07
 * @Version V1.0
 * @ClassName GenericTest
 * @Description TODO:
 */
public class GenericTest {

    /**
     * 泛型在继承方面的体现
     *
     * 1.类A是类B的父类，G<A>和G<B>不具备子父类关系
     */
    @Test
    public void test1(){
        Object obj = null;
        String str = null;
        obj = str;

        Object[] arr1 = null;
        String[] arr2 = null;
        arr1 = arr2;

        List<Object> list1 = null;
        List<String> list2 = null;
        //此时list1和list2的类型不具有子父类关系
//        list1 = list2;
    }

    /*
    有限制条件的通配符的使用
    ? extends Person:
    ? super Person:
     */
    @Test
    public void test4(){
         List<? extends Person> list1 = null;
         List<? super Person> list2 = null;

         List<Student> list3 = null;
         List<Person> list4 = null;
         List<Object> list5 = null;
    }

}
