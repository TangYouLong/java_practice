package com.atguigu.java;

import org.junit.Test;

import java.io.*;

/**
 * @Author Tang YouLong
 * @Date 2021/8/20 21:43
 * @Version V1.0
 * @ClassName BufferTest
 * @Description TODO:
 *
 * 处理流之一：缓冲流的作用
 *
 *
 */
public class BufferTest {

    /**
     * 实现非文本文件的复制
     */
    @Test
    public void BufferedStremTest() throws FileNotFoundException{
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;

        try {
            //1.造文件
            File srcFile = new File("阿波罗.jpg");
            File destFile = new File("阿波罗1");

            //2.造流
            //节点流
            FileInputStream fis = new FileInputStream(srcFile);
            FileOutputStream fos = new FileOutputStream(destFile);

            //缓冲流
            bis = new BufferedInputStream(fis);
            bos = new BufferedOutputStream(fos);

            //3.复制的细节:读取、写入
            byte[] buffer = new byte[10];
            int len;
            while((len = bis.read(buffer)) != -1){
                bos.write(buffer,0,len);
            }


        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4.资源关闭（要先关闭外层的流，再关闭内层的流）
            if(bos != null){
                try {
                    bos.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }

            if(bis != null){
                try{
                    bis.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }

//            //说明：关闭外层流的同事，内层流也会自动的进行关闭，关于内层流的关闭，可以省略
//            fos.close();
//            fis.close();
        }

    }

    /**
     * 使用BufferedReader和BufferWriter实现文本文件的复制
     */
    @Test
    public void testBuffferedReaderBufferedWriter() throws IOException {
        BufferedReader br = null;
        BufferedWriter bw = null;

        try {
            //创建文件和相应的流
            br = new BufferedReader(new FileReader(new File("dbcp.txt")));
            bw = new BufferedWriter(new FileWriter(new File("dbcp1.txt")));

            //☆读写操作
            //方式1：使用char[]数组
//            char[] cbuf = new char[1024];
//            int len;
//            while(len = br.read(cbuf) != -1){
//                bw.write(cbuf,0,len);
//    //            bw.flush();
//            }
            //方式2：使用String
            String data;
            while((data = br.readLine()) != null){
                bw.write(data);//data中不包含换行符
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //关闭资源
            if(bw != null){
                bw.close();
                br.close();
            }
        }

    }
}


