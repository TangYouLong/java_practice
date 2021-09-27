package com.atguigu.java1;

import java.io.Serializable;

/**
 * @Author Tang YouLong
 * @Date 2021/9/27 22:03
 * @Version V1.0
 * @ClassName Creature
 * @Description TODO:
 */
public class Creature<T> implements Serializable {

    private char gender;
    public double weight;

    private void breath(){
        System.out.println("生物呼吸");
    }

    public void eat(){
        System.out.println("生物吃东西");
    }
}
