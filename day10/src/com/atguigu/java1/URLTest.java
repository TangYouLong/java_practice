package com.atguigu.java1;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * @Author Tang YouLong
 * @Date 2021/9/22 23:54
 * @Version V1.0
 * @ClassName URL网络编程
 * @Description TODO:
 *
 * URL网络编程
 *
 */
public class URLTest {
    public static void main(String[] args) {
        try{
            URL url = new URL("http://localhost:8080/G:\\自媒体创作素材\\图片\\希腊神话图片素材\\3.png");

            System.out.println(url.getProtocol());//获取该URL的协议名

            System.out.println(url.getHost());//获取该URL的主机名

            System.out.println(url.getPort());//获取该URL端口号

            System.out.println(url.getPath());//获取该URL文件路径

            System.out.println(url.getFile());//获取该URL文件名

            System.out.println(url.getQuery());//获取该URL查询名


        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
