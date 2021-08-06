package com.atguigu.exer;

import org.junit.Test;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;


/**
 * @Author TYL
 * @Date 2021/7/16 17:33
 * @Version V1.0
 * @ClassName EmployeeTest
 * @Description TODO:
 *
 * 创建该类的 5 个对象，并把这些对象放入 TreeSet 集合中（下一章：TreeSet 需使用泛型来定义）
 *  分别按以下两种方式对集合中的元素进行排序，并遍历输出：
 *
 *  1). 使Employee 实现 Comparable 接口，并按 name 排序
 *  2). 创建 TreeSet 时传入 Comparator对象，按生日日期的先后排序。
 */
public class EmployeeTest {

    //问题2：按生日日期的先后排序
    @Test
    public void test2(){
        TreeSet<Employee> set = new TreeSet<Employee>(new Comparator<Employee>() {
            //使用泛型以后的写法
            @Override
            public int compare(Employee o1, Employee o2) {
                return 0;
            }


            //使用泛型之前的写法
//            @Override
//            public int compare(Object o1, Object o2) {
//                if(o1 instanceof Employee && o2 instanceof Employee){
//                    Employee e1 = (Employee)o1;
//                    Employee e2 = (Employee)o2;
//
//                    MyDate b1 = e1.getBirthday();
//                    MyDate b2 = e2.getBirthday();
//                    //方式一：
////                    //比较年
////                    int minusYear = b1.getYear() - b2.getYear();
////                    if(minusYear != 0){
////                        return minusYear;
////                    }
////                    //比较月
////                    int minusMonth = b1.getMonth() - b2.getMonth();
////                    if(minusMonth != 0){
////                        return minusMonth;
////                    }
////                    //比较日
////                    return b1.getDay() - b2.getDay();
//
//                    //方式二：
//                    return b1.compareTo(b2);

////              return 0;
//                throw new RuntimeException("传入的数据类型不一致！");
//            }
        });

        Employee e1 = new Employee("路人甲",11,new MyDate(2001,1,1));
        Employee e2 = new Employee("路人乙",12,new MyDate(2002,1,1));
        Employee e3 = new Employee("路人丙",13,new MyDate(2003,1,1));
        Employee e4 = new Employee("路人丁",14,new MyDate(2004,1,1));
        Employee e5 = new Employee("路人戊",15,new MyDate(2005,1,1));


        set.add(e1);
        set.add(e2);
        set.add(e3);
        set.add(e4);
        set.add(e5);

        Iterator<Employee> iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }


    //问题1：使用自然排序
    @Test
    public void test1(){
        TreeSet<Employee> set = new TreeSet<Employee>();
        Employee e1 = new Employee("路人甲",11,new MyDate(2001,1,1));
        Employee e2 = new Employee("路人乙",12,new MyDate(2002,1,1));
        Employee e3 = new Employee("路人丙",13,new MyDate(2003,1,1));
        Employee e4 = new Employee("路人丁",14,new MyDate(2004,1,1));
        Employee e5 = new Employee("路人戊",15,new MyDate(2005,1,1));


        set.add(e1);
        set.add(e2);
        set.add(e3);
        set.add(e4);
        set.add(e5);

        Iterator<Employee> iterator = set.iterator();
        while(iterator.hasNext()){
            Employee employee = iterator.next();
            System.out.println(employee);
        }
    }
}
