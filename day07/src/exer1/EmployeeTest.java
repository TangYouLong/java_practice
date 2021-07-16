package exer1;

import org.junit.Test;

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

    @Test
    public void test1(){
        TreeSet set = new TreeSet();
        Employee e1 = new Employee("路人甲",11,new MyDate(2001,1,1));
        Employee e2 = new Employee("路人乙",12,new MyDate(2002,1,1));
        Employee e3 = new Employee("路人丙",13,new MyDate(2003,1,1));
        Employee e4 = new Employee("路人丁",14,new MyDate(2004,1,1));
        Employee e5 = new Employee("路人戊",15,new MyDate(2005,1,1));


        set.add();
    }
}
