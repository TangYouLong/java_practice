package com.atguigu.java;

import org.junit.Test;

import java.io.*;

/**
 * @Author Tang YouLong
 * @Date 2021/8/9 23:57
 * @Version V1.0
 * @ClassName FileReaderWriterTest
 * @Description TODO:
 *
 *  一、流的分类：
 *  1.操作数据单位：字节流、字符流
 *  2.数据的流向：输入流、输出流
 *  3.流的角色：节点流、处理流
 *
 *  二、流的体系结构
 *  抽象基类         节点流（或文件流）                               缓冲流（处理流的一种）
 *  InputStream     FileInputStream   (read(byte[] buffer))        BufferedInputStream (read(byte[] buffer))
 *  OutputStream    FileOutputStream  (write(byte[] buffer,0,len)  BufferedOutputStream (write(byte[] buffer,0,len) / flush()
 *  Reader          FileReader (read(char[] cbuf))                 BufferedReader (read(char[] cbuf) / readLine())
 *  Writer          FileWriter (write(char[] cbuf,0,len)           BufferedWriter (write(char[] cbuf,0,len) / flush()
 */
public class FileReaderWriterTest {

    public static void main(String[] args) {
        File file = new File("hello.txt");//相较于当前工程
        System.out.println(file.getAbsoluteFile());

        File file1 = new File("day09\\hello.txt");
        System.out.println(file1.getAbsoluteFile());
    }

    /*
    将day09下的hello.txt文件内容读入程序中，并输出到控制台
     */
    @Test
    public void testFileReader() throws IOException {
        //1.实例化File类的对象，指明要操作的文件
        File file = new File("D:\\professional\\GitSpace\\workspace_idea\\JavaSenior\\day09\\src\\hello.txt");//相较于当前Moldule
        //2.提供具体的流
        FileReader fr = new FileReader(file);
        //3.数据的读入
        //read()返回读入的一个字符，如果达到文件末尾，返回-1
        int data = fr.read();
        while(data != -1){
            System.out.print((char)data);
            data = fr.read();
        }

        //4.流的关闭操作
        fr.close();
    }

    //对read()操作升级，使用read重载方法
    @Test
    public void testFileReader1() throws FileNotFoundException {
        FileReader fr = null;
        try {
            //1.File类的实例化
            File file = new File("D:\\professional\\GitSpace\\workspace_idea\\JavaSenior\\day09\\src\\hello.txt");//相较于当前Moldule

            //2.FileReader流的实例化
            fr = new FileReader(file);

            //3.读入的操作
            //read(char[] cbuf):返回每次读入cbuf数组中的字符的个数，如果达到文件末尾，返回-1
            char[] cbuf = new char[5];
            int len;
            while((len = fr.read(cbuf)) != -1){
                //错误的写法，文件为：helloworld123，结果为：helloworld123ld
//                for (int i = 0;i < cbuf.length;i++){
//                    System.out.print(cbuf[i]);
//                }
                //第一种正确写法
//                for (int i = 0;i < len;i++){
//                    System.out.print(cbuf[i]);
//                };
                //第二种正确写法
                String str = new String(cbuf,0,len);
                System.out.println(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (fr != null);{
                //4.资源的关闭
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    @Test
    public void testFileWriter() throws IOException {
        //1.提供File类的对象，指明写出到的文件
        File file = new File("hello1.txt");

        //2.提供FileWriter的对象，用于数据的写出
        FileWriter f1 = new FileWriter(file,true);

        //3.写出的操作
        f1.write("I have a dream");
        f1.write("you need to have a dream");

        //4.流资源的关闭
        f1.close();

    }

    @Test
    public void testFileReaderFileWriter() throws IOException {
        FileReader fr = null;
        FileWriter f1 = null;

        try {
            //1.创建File类的对象，指明读入和写出的文件
            File srcFile = new File("hello.txt");
            File destFile = new File("hello2.txt");

            //2.创建输入流和输出流的对象
            fr = new FileReader(srcFile);
            f1 = new FileWriter(destFile);

            //3.数据的读入和写出操作
            char[] cbuf = new char[5];
            int len;//记录每次读入到cbuf数组中的字符的个数
            while ((len = fr.read(cbuf)) != -1){
                //每次写出len个字符
                f1.write(cbuf,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if(f1 != null){
                    f1.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                if(fr != null){
                    fr.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
