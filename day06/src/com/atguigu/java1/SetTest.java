package com.atguigu.java1;

/**
 * @Author TYL
 * @Date 2021/7/8 15:05
 * @Version V1.0
 * @ClassName SetTest
 * @Description TODO:
 * 1.
 *  |----Set接口：存储无序的、不可重复的数据   -->高中讲的“集合”
 *     |----HashSet：作为Set接口的主要实现类；线程不安全的；可以存储null值
 *        |----LinkedHashSet：作为HashSet的子类；遍历其内部数据时，可以按照添加的顺序遍历
 *             对于频繁的遍历操作，LinkedHashSet效率高于HashSet.
 *                |----TreeSet：可以按照添加对象的指定属性，进行排序。
 */

import com.atguigu.java.Person;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * 1.无序性
 *
 */
public class SetTest {
    @Test
    public void test1(){
        Set set = new HashSet();
        set.add(1);
        set.add(2);
        set.add("A");
        set.add("B");
        set.add(new Person("Tom",12));
        set.add(123);

        Iterator iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    @Test
    public void test2(){
        Set set = new LinkedHashSet();

        set.add(1);
        set.add(2);
        set.add("A");
        set.add("B");
        set.add(new Person("Tom",12));
        set.add(123);

        Iterator iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
