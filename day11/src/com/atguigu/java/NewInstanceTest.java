package com.atguigu.java;

import org.junit.Test;

import java.util.Random;

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
        newInstance():调用此方法，创建对应的运行时类的对象内部调用了运行时类的空参构造器

        要想此方法正常的创建运行时类的对象，要求：
        1.运行时类必须提供空参的构造器
        2.空参的构造器的访问权限需要足够（通常，设置为public）

        在javabean中要求提供一个public的空参构造器。原因：
        1.便于通过反射，创建运行时类的对象
        2.便于子类继承此运行时类是，默认调用super()时，保证父类有此构造器

         */
        Person obj = clazz.newInstance();
        System.out.println(obj);
    }

    @Test
    public void test2(){

        int num = new Random().nextInt(3);
        String classPath = "";
        switch(num) {
            case 0:
                classPath = "java.util.Date";
                break;
            case 1:
                classPath = "java.sql.Date";
                break;
            case 2:
                classPath = "com.atguigu.java.Person";
                break;
        }

        try {
            Object obj = getInstance(classPath);
            System.out.println(obj);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /*
    创建一个指定类的对象
    classpath:指定类的全类名
     */
    public Object getInstance(String classPath) throws Exception {
        Class clazz = Class.forName(classPath);
        return clazz.newInstance();
    }
}
