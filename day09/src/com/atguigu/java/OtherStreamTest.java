package com.atguigu.java;

import org.junit.Test;

import java.io.*;

/**
 * @Author Tang YouLong
 * @Date 2021/9/5 15:41
 * @Version V1.0
 * @ClassName OtherStreamTest
 * @Description TODO:
 * 其他流的使用：
 * 1.标准输入、输出流
 * 2.打印流
 * 3.数据流
 */
public class OtherStreamTest {
    /*
    1.标准输入、输出流
    1.1
    System.in:标准输入流，默认从键盘输入
    System.out:标准输出流，默认从控制台输出
    1.2
    System类的setIn(InputStream is) / setOut(PrintStream ps)方式重新指定输入和输出的流

    1.3练习：
    从键盘输入字符串，要求将读取到的整行字符串转成大写输出。然后继续进行输入操作，
    直至当输入“e”或者“exit”时，退出程序。

    方法1：使用Scanner实现
    调用next()返回一个字符串
    方法2：使用System.in实现
    System.in --> 转换流 --> BufferedReader的readLine()
     */

    public static void main(String[] args) {
        BufferedReader br =  null;
        try {
            InputStreamReader isr = new InputStreamReader(System.in);
            br = new BufferedReader(isr);

            while(true){
                System.out.println("请输入字符串:");
                String data = br.readLine();
                if(data.equalsIgnoreCase("e") || data.equalsIgnoreCase("exit")){
                    System.out.println("程序结束");
                    break;
                }
                String upperCase = data.toUpperCase();
                System.out.println(upperCase);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(br != null){
                try{
                    br.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
    }

    /*
    2.打印流
    实现将基本数据类型的数据格式转化为字符串输出
    PrintStream:
    PrintWriter:
     */

    /*
    3.数据流
    作用：用于读取或写出基本数据类型的变量或字符串
    DataInputStream：
    DataOutputStream：
     */
    @Test
    public void test3() throws IOException {
        DataOutputStream dos = new DataOutputStream(new FileOutputStream("data.txt"));

        dos.writeUTF("百里州");
        dos.writeInt(23);
        dos.writeBoolean(true);

        dos.close();
    }

    /*
    将文件中存储的基本数据类型变量和字符串读取到内存中，保存在变量中
    注意点：读取不同类型的数据的顺序要与当初写入文件时，保存的数据的顺序一致。
     */
    @Test
    public void test4() throws IOException {
        //1
        DataInputStream dis = new DataInputStream(new FileInputStream("data.txt"));

        //2
        String name = dis.readUTF();
        int age = dis.readInt();
        boolean isMale = dis.readBoolean();

        System.out.println("name = " + name);
        System.out.println("age = " + age);
        System.out.println("isMale = " + isMale);

        //3
        dis.close();

    }
}
