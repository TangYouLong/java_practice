package com.atguigu.java;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.charset.StandardCharsets;

/**
 * @Author TYL
 * @Date 2021/9/9 14:36
 * @Version V1.0
 * @ClassName RandomAccessFileTest
 * @Description TODO:
 *
 * RandomAccessFile的使用
 * 1.RandomAccessFile直接继承于java.lang.Object类，实现了
 * DataInput和DataOutput接口。
 * 2.RandomAccessFile既可以作为一个输入流，又可以作为一个输出流。
 * 3.如果RandomAccessFile作为输出流时，写出到的文件如果不存在，则在执行过程中自动创建
 * 如果写出到的文件存在，则会对原有文件进行覆盖（默认从头覆盖）
 * 4.可以通过相关的操作，实现RandomAccessFile是一个“插入”数据的效果
 *
 */
public class RandomAccessFileTest {

    @Test
    public void test1() throws IOException {
        RandomAccessFile raf1 = null;
        RandomAccessFile raf2 = null;
        try {
            raf1 = new RandomAccessFile(new File("盖亚.jpg"),"r");
            raf2 = new RandomAccessFile(new File("盖亚2.jpg"), "rw");

            byte[] buffer = new byte[1024];
            int len;
            while((len = raf1.read(buffer)) != -1){
                raf2.write(buffer,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(raf1 != null){
                try {
                    raf1.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(raf2 != null){
                try {
                    raf2.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }


    @Test
    public void test2() throws IOException {
        RandomAccessFile raf1 = new RandomAccessFile("hello.txt","rw");
        raf1.seek(3);//将指针调到角标为3的位置，但是这样是实现了用指定的数据覆盖角标3后面的数据的效果
        raf1.write("xyz".getBytes());
        raf1.close();
    }

    /*
    使用RandomAccessFile实现数据的插入效果
     */

    @Test
    public void test3() throws IOException {
        RandomAccessFile raf1 = new RandomAccessFile("hello.txt","rw");
        raf1.seek(3);//将指针调到角标为3的位置

        //保存指针3后面的所有数据
        StringBuilder builder= new StringBuilder(new File("hello.txt").length());
        byte[] buffer = new byte[20];

        int len;
        while((len = raf1.read(buffer)) != -1){
            builder.append(new String(buffer,0,len));
        }

        //调回指针，写入"xyz"
        raf1.seek(3);
        raf1.write("xyz".getBytes(StandardCharsets.UTF_8));

        //将StringBuilder中的数据
        raf1.write(builder.toString().getBytes(StandardCharsets.UTF_8));
        raf1.close();
    }

    //思考：将StringBuilder替换为ByteArrayOutPutStream

}
