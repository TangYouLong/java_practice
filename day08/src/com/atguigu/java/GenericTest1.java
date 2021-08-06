package com.atguigu.java;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author TYL
 * @Date 2021/8/3 11:12
 * @Version V1.0
 * @ClassName GenericTest1
 * @Description TODO:
 */
public class GenericTest1 {

    @Test
    public void test1(){
        //如果定义了泛型类，实例化没有指明类的类型，则认为此泛型类型为Object类型
        //要求：如果大家定义了类是带泛型的，在实例化时建议要指明类的类型

        Order order = new Order();
        order.setOrderT(123);
        order.setOrderT("ABC");

        Order<String> order1 = new Order<String>("orderAA",1001,"order:AA");
        order1.setOrderT("AA");
    }

    @Test
    public void test2(){
        SubOrder sub1 = new SubOrder();
        //由于子类在继承带泛型的父类时，指明了泛型类型，则实例化子类对象时，不再需要指明泛型
        sub1.setOrderT(12);
    }

    @Test
    public void test3(){
        ArrayList<String> list1 = null;
        ArrayList<Integer> list2 = null;
        //泛型不同的引用不能相互赋值
//        list1 = list2;
    }

    //测试泛型方法
    @Test
    public void test4(){
     Order<String> order = new Order<>();
     Integer[] arr = new Integer[]{1,2,3};
     //泛型方法在调用时，指明泛型参数的类型
     List<Integer> list = order.copyFromArrayToList(arr);
     System.out.println(list);
    }



}
