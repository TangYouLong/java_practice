package com.atguigu.java;

import org.junit.Test;

import java.util.Date;

/**
 * @Author TYL
 * @Date 2021/5/6 14:01
 * @Version V1.0
 * @ClassName DateTimeTest
 * @Description TODO:
 */
public class DateTimeTest {

    //1.System类中的currentTimeMillis()
    @Test
    public void test1(){
        //返回当前时间与1970年1月1日0时0分0秒之间以毫秒为单位的时间差。
        //称为时间戳
        long time = System.currentTimeMillis();
        System.out.println(time);
    }

    @Test
    public void test2(){
        //构造器一：Date()
        Date date1 = new Date();
        System.out.println(date1.toString());

        System.out.println(date1.getTime());

        //构造器二：创建指定毫秒数的Date对象
        Date date2 = new Date(1620282233121L);
        System.out.println(date2);

        //创建java.sql.Date对象
        java.sql.Date date3 = new java.sql.Date(1620282233121L);
        System.out.println(date3);
    }
}
