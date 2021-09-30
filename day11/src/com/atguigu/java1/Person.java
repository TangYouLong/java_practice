package com.atguigu.java1;

/**
 * @Author Tang YouLong
 * @Date 2021/9/27 22:02
 * @Version V1.0
 * @ClassName Person
 * @Description TODO:
 *
 */
public class Person extends Creature<String> implements Comparable<String>,MyInterface{

    private String name;
    int age;
    public int id;
    public Person(){}

    private Person(String name){
        this.name = name;
    }

    Person(String name,int age){
        this.name = name;
        this.age = age;
    }

     private String show(String nation){
         System.out.println("我的国籍是" + nation);
         return nation;
     }

     public String  dispaly(String interest){
        return interest;
     }

    @Override
    public void info() {
        System.out.println("他是一个人");
    }

    @Override
    public int compareTo(String o) {
        return 0;
    }
}
