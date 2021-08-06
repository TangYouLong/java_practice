package com.atguigu.java;

import org.junit.Test;

import java.util.*;

/**
 * @Author TYL
 * @Date 2021/8/2 10:53
 * @Version V1.0
 * @ClassName GenericTest
 * @Description TODO:
 */
public class GenericTest {


    //在集合中使用泛型之前的情况
    @Test
    public void test1(){
        ArrayList list = new ArrayList();
        //需求：存放学生的成绩
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        //问题1：类型不安全
        list.add("Tom");
        for(Object score:list){
            //问题二：强转时，可能出现ClassCastException
            int stuScore = (Integer) score;
            System.out.println(stuScore);
        }
    }

    //在集合中使用泛型的情况-ArrayList举例
    @Test
    public void test2(){
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(1);
        list.add(2);
        list.add(3);
        //编译时，会进行类型的检查，保证数据安全
//        list.add("TOM");

        //遍历时避免了强转操作
        //方式一
//        for(Integer score :list){
//            int stuScore = score;
//            System.out.println(stuScore);
//        }

        //方式二
        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()){
            int stuScore = iterator.next();
            System.out.println(stuScore);
        }
    }

    //在集合中使用泛型的情况：以HashMap举例
    @Test
    public void test3(){
        Map<String,Integer> map = new HashMap<String,Integer>();
        map.put("A",123);
        map.put("B",123);
//        map.put(123,"A");

        //泛型的嵌套
        Set<Map.Entry<String,Integer>> entry = map.entrySet();
        Iterator<Map.Entry<String,Integer>> iterator = entry.iterator();

        while(iterator.hasNext()){
            Map.Entry<String,Integer> e = iterator.next();
            String key = e.getKey();
            Integer value = e.getValue();
            System.out.println(key + ":" + value);
        }
    }


}
