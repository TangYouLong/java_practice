package com.atguigu.exer1;

/**
 * @Author TYL
 * @Date 2021/7/16 11:00
 * @Version V1.0
 * @ClassName Employee
 * @Description TODO:
 *
 * 定义一个Employee类。
 *  该类包含：private成员变量name,age,birthday，其中 birthday 为 MyDate 类的对象；
 *  并为每一个属性定义 getter, setter 方法；
 *  并重写 toString 方法输出 name, age, birthday
 */
public class Employee implements Comparable{

    private String name;
    private int age;
    private MyDate birthday;

    public Employee() {
    }

    public Employee(String name, int age, MyDate birthday) {
        this.name = name;
        this.age = age;
        this.birthday = birthday;
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

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }


    //按照姓名数据排
    @Override
    public int compareTo(Object o) {
        if(o instanceof Employee){
            Employee e =(Employee)o;
            return this.name.compareTo(e.getName());
        }
        throw new RuntimeException("传入的数据类型不一致");
    }
}
