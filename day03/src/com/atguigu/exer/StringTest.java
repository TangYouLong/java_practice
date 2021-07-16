package com.atguigu.exer;

/**
 * @Author TYL
 * @Date 2021/4/23 10:51
 * @Version V1.0
 * @ClassName StringTest
 * @Description TODO:
 */
public class StringTest {
    String str = new String("good");
    char[] ch = { 't', 'e', 's', 't' };
    public void change(String str, char ch[]) {
        str = "test ok";
        ch[0] = 'b'; }
    public static void main(String[] args) {
        StringTest ex = new StringTest();
        ex.change(ex.str, ex.ch);
        System.out.print(ex.str + " and ");//
        System.out.println(ex.ch);
    }
}
