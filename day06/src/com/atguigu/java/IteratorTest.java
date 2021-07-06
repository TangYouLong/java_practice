package com.atguigu.java;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @Author TYL
 * @Date 2021/6/29 17:56
 * @Version V1.0
 * @ClassName IteratorTest
 * @Description TODO:
 */
public class IteratorTest {
    @Test
    public void test1(){
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new String("Tom"));
        coll.add(new Person("Jerry",20));

        Iterator iterator = coll.iterator();
        System.out.println(iterator.next());
    }

    //测试Interator中的remove
    @Test
    public void test3(){
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new String("Tom"));
        coll.add(new Person("Jerry",20));
        coll.add(true);

        Iterator iterator = coll.iterator();
        while(iterator.hasNext());
    }

}
