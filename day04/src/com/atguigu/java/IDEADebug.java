package com.atguigu.java;

import org.junit.Test;

/**
 * @Author TYL
 * @Date 2021/5/18 15:10
 * @Version V1.0
 * @ClassName IDEADebug
 * @Description TODO:
 */
public class IDEADebug {

    @Test
    public void testStringBuffer(){
        String str = null;
        StringBuffer sb = new StringBuffer();
        sb.append(str);
        System.out.println(sb.length());//
        System.out.println(sb);//
        StringBuffer sb1 = new StringBuffer(str);
        System.out.println(sb1);//
    }
}
