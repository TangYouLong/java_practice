package com.atguigu.java;

import org.junit.Test;

/**
 * @Author TYL
 * @Date 2021/4/25 15:19
 * @Version V1.0
 * @ClassName StringMethodTest
 * @Description TODO:
 */
public class StringMethodTest {

    @Test
    public void test4(){
        String str1 = "百度集团";
        String str2 = str1.replace('百', '腾');
        System.out.println(str1);
        System.out.println(str2);

        String str3 = str1.replace("百度", "腾讯");
        System.out.println(str3);
    }

    @Test
    public void test3(){
        String str1 = "helloworld";
        boolean b1 = str1.endsWith("ld");
        System.out.println(b1);

        boolean b2 = str1.startsWith("he");
        System.out.println(b2);

        boolean b3 = str1.startsWith("ll",2);
        System.out.println(b2);

        String str2 = "wo";
        System.out.println(str1.contains(str2));
    }

    @Test
    public void test2(){
        String s1 = "HelloWorld";
        String s2 = "helloworld";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));

        String s3 = "abc";
        String s4 = s3.concat("def");
        System.out.println(s4);

        String s5 = "abc";
        String s6 = new String("abe");
        System.out.println(s5.compareTo(s6));

        String s7 = "腾讯集团";
        String s8 = s7.substring(2);
        System.out.println(s8);

        s7.substring(2,4);
    }

    @Test
    public void test1(){
        String s1 = "helloworld";
        System.out.println(s1.length());
        System.out.println(s1.charAt(0));
        System.out.println(s1.isEmpty());
        String s2 = s1.toUpperCase();
        System.out.println(s1);
        System.out.println(s2);

        String s3 = "  he  ll oo world ";
        String s4 = s3.trim();
        System.out.println("s3" + s3);
        System.out.println("s4" + s4);
    }
}
