package com.atguigu.java;

import org.junit.Test;

/**
 * @Author TYL
 * @Date 2021/4/20 15:11
 * @Version V1.0
 * @ClassName StringTest
 * @Description TODO: String的使用
 */
public class StringTest {





    /**
     * String实例化方式
     * 方式一：通过字面量定义的方式
     * 方式二：通过new + 构造器的方式
     *
     * 面试题：String s = new String("abc");方式创建对象，在内存中创建了几个对象？
     * 两个:一个是堆空间中new结构，另一个是char[]对应的常量池中的数据："abc"
     */
    @Test
    public void test2(){

        String s1 = "javaEE";
        String s2 = "javaEE";

        String s3 = new String("javaEE");
        String s4 = new String("javaEE");

        System.out.println(s1 == s2);
        System.out.println(s3 == s4);

    }



    /**
     * 1.String声明为final的，不可被继承
     * 2.String实现了Serializable接口：表示字符串是支持序列化的。
     * 实现了Comparable接口：表示String可以比较大小
     * 3.String内部定义了final char[] value用于存储字符串数据
     * 4.String:代表不可变的字符序列。简称：不可变性。
     * 体现：1.当对字符串重新赋值时，需要重写指定内存区域赋值，不能使用原有的value进行赋值。
     * 2. 当对现有的字符串进行连接操作时，也需要重新指定内存区域赋值，不能使用原有的value进行赋值。
     * 3. 当调用String的replace()方法修改指定字符或字符串时，也需要重新指定内存区域赋值，不能使用原有的value进行赋值。
     *     5.通过字面量的方式（区别于new）给一个字符串赋值，此时的字符串值声明在字符串常量池中。
     *     6.字符串常量池中是不会存储相同内容的字符串的。
     */
    @Test
    public void test1(){
        String s1 = "abc";
        String s2 = "abc";
        s1 = "hello";

        System.out.println(s1 == s2);

        System.out.println(s1);
        System.out.println(s2);

        System.out.println("**********");
        String s3 = "abc";
        s3 += "def";
        System.out.println(s3);
        System.out.println(s2);

        System.out.println("**********");
        String s4 = "abc";
        String s5= s4.replace('a','m');
        System.out.println(s4);
        System.out.println(s5);
    }
}
