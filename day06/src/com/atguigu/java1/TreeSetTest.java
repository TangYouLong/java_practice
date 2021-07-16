package com.atguigu.java1;

import org.junit.jupiter.api.Test;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * @Author TYL
 * @Date 2021/7/15 16:20
 * @Version V1.0
 * @ClassName TreeSetTest
 * @Description TODO:
 */
public class TreeSetTest {
    @Test
    public void test1(){
        TreeSet set = new TreeSet();

        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);

        Iterator iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }




}
