package com.atguigu.java;

import org.junit.Test;

/**
 * @Author Tang YouLong
 * @Date 2021/9/23 22:03
 * @Version V1.0
 * @ClassName ReflectionTest
 * @Description TODO:
 */
public class ReflectionTest {

    //反射之前，对于Person的操作
    @Test
    public void test1() {

        //1.创建Person类的对象
        Person p1 = new Person("Tom", 12);

        //2.通过对象，调用其内部的属性、方法
        p1.age = 10;
        System.out.println(p1.toString());

        p1.show();

        //在Person类外部，不可以通过Person类的对象调用其内部私有结构。
        //比如：name、showNation()以及私有的构造器
    }
}
