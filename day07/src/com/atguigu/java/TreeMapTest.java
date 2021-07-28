package com.atguigu.java;

import org.junit.jupiter.api.Test;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * @Author TYL
 * @Date 2021/7/27 16:43
 * @Version V1.0
 * @ClassName TreeMapTest
 * @Description TODO:
 */
public class TreeMapTest {
    //向TreeMap中添加key-value,要求key必须是同一个类创建的对象，因为要按照key进行排序
    @Test
    public void test1(){
        TreeMap map = new TreeMap();
        User u1 = new User("one",1);
        User u2 = new User("two",2);
        User u3 = new User("three",3);
        User u4 = new User("four",4);

        map.put(u1,97);
        map.put(u2,98);
        map.put(u3,99);
        map.put(u4,100);

        Set entrySet = map.entrySet();
        Iterator iterator = entrySet.iterator();
        while (iterator.hasNext()){
            Object obj = iterator.next();
            Map.Entry entry = (Map.Entry) obj;
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}
