package com.atguigu.java;

import org.junit.Test;

import java.io.*;

/**
 * @Author Tang YouLong
 * @Date 2021/9/6 21:03
 * @Version V1.0
 * @ClassName ObjectInputOutputStreamTest
 * @Description TODO:
 *
 * 对象流的使用
 * 1.ObjectInputStream 和 ObjectOutputStream
 * 2.用于存储和读取基本数据类型数据或对象的处理流。它的强大之处就是可
 * 以把Java中的对象写入到数据源中，也能把对象从数据源中还原回来。
 * 3.要想一个java对象是可序列化的，需要满足相应的要求
 * (1.需要实现接口：Serializable
 * 2.需要当前类提供一个全局常量：serialVersionUID)
 *
 *
 */
public class ObjectInputOutputStreamTest {

    /*
    序列化过程：将内存中的java对象保存到磁盘中或通过网络传输出去
    使用ObjectOutputStream实现
     */

    @Test
    public void testObjectOutputStream() throws IOException {
        ObjectOutputStream oss = null;

        try {
            //1
            oss = new ObjectOutputStream(new FileOutputStream("object.dat"));
            //2
            oss.writeObject(new String("我爱北京天安门"));
            oss.flush();

            oss.writeObject(new Person("王铭",23));
            oss.flush();
            //3
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(oss != null){
                oss.close();
            }
        }
    }

    /*
    反序列化：将磁盘文件中的对象还原为内存中的一个java对象
     */
    @Test
    public void testObjectInputStream(){
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream("object.dat"));

            Object obj = ois.readObject();
            String str = (String)obj;

            Person p = (Person)ois.readObject();

            System.out.println(p);
            System.out.println(str);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if(ois != null){
                try{
                    ois.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
