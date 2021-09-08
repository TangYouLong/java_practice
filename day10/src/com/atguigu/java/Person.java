package com.atguigu.java;

import java.io.Serializable;

/**
 * @Author Tang YouLong
 * @Date 2021/9/6 21:44
 * @Version V1.0
 * @ClassName Person
 * @Description TODO:
 */
public class Person implements Serializable {

    public static final long serialVersionUID = 475463534532l;

    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
