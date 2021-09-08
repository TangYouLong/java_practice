package com.atguigu.java;

import org.junit.Test;

import java.io.*;

/**
 * @Author Tang YouLong
 * @Date 2021/8/31 21:49
 * @Version V1.0
 * @ClassName InputStreamReadr
 * @Description
 * TODO: 处理流2：转换流的使用
 * 1.转换流：属于字符流
 * InputStreamReader:讲一个字节的输入流转换为字符的输入流
 * OutputStreamWriter:将一个字符的输出流转换为字节的输出流
 *
 * 2.作用：提供字节流和字符流的转换
 *
 * 3.解码：字节、字节数组 -->字符数组、字符串
 * 编码：字符数组、字符串-->字节、字节数组
 *
 *
 *
 */
public class InputStreamReaderTest {


    @Test
    public void test1() throws IOException {
        FileInputStream fis = new FileInputStream("dbcp.txt");
        InputStreamReader isr = new InputStreamReader(fis,"UTF-8");
        char[] cbuf = new char[20];
        int len;
        while((len = isr.read(cbuf)) != -1){
            String str = new String(cbuf,0,len);
            System.out.println(str);
        }
        isr.close();
    }

    /*
    综合使用InputStreamReader和OutputStreamWriter
     */
    @Test
    public void test2() throws IOException {

        File file1 = new File("dbcp.txt");
        File file2 = new File("dpcp_gbk.txt");

        FileInputStream fis = new FileInputStream(file1);
        FileOutputStream fos = new FileOutputStream(file2);

        InputStreamReader isr = new InputStreamReader(fis,"utf-8");
        OutputStreamWriter osw =  new OutputStreamWriter(fos,"gbk");

        //2.读写过程
        char[] cbuf = new char[20];
        int len;
        while((len = isr.read(cbuf)) != -1){
            osw.write(cbuf,0,len);
        }

        //3.关闭资源
        isr.close();
        osw.close();
    }

}
