package com.atguigu.java;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author TYL
 * @Date 2021/7/22 16:59
 * @Version V1.0
 * @ClassName MapTest
 * @Description TODO:
 */
public class MapTest {

    /*
    添加、删除、修改操作
    Object put(Object key,Object value):将指定key-value添加到（或修改）当前map对象中
     */
    @Test
    public void test1(){
        Map map = new HashMap();
        map.put("AA",123);
        map.put("BB",1);
        map.put("AA",2);
        System.out.println(map);
    }

    //void putAll(Map m):将m中的所有key-value对存放到当前map中
    @Test
    public void test2(){
        Map map = new HashMap();
        map.put("AA",123);
        map.put("BB",1);
        map.put("AA",2);

        Map map1 = new HashMap();
        map1.put("CC",3);
        map1.put("DD",4);
        map.putAll(map1);
        System.out.println(map);
    }

    //Object remove(Object key)：移除指定key的key-value对，并返回value

    //Object get(Object key) ：获取指定key对应的value
    @Test
    public void test3(){
        Map map = new HashMap();
        map.put("AA",123);
        map.put("BB",1);
        //Object get(Object key) ：获取指定key对应的value
        System.out.println(map.get("AA"));
        //bolean containinsKey(Object key)：是否包含指定的key
        boolean isExist = map.containsKey("AA");
        System.out.println(isExist);
    }


    //Set keySet：返回所有key构成的Set集合
    //Collection values()：返回所有value构成的Collection集合
    //Set entrySet()：返回所有key-value对构成的Set集合
    @Test
    public void test5(){

    }
}
