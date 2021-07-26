package com.atguigu.exer;

/**
 * @Author TYL
 * @Date 2021/7/22 16:20
 * @Version V1.0
 * @ClassName Person
 * @Description TODO:
 */
public class Person {


    int id;
    String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Person() {

    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

}
