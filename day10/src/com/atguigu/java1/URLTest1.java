package com.atguigu.java1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * @Author Tang YouLong
 * @Date 2021/9/23 0:30
 * @Version V1.0
 * @ClassName URLTest1
 * @Description TODO:
 */
public class URLTest1 {

    public static void main(String[] args) throws IOException {

        HttpURLConnection urlConnection = null;
        InputStream is = null;
        FileOutputStream fos = null;
        try {
            URL url = new URL("http://localhost:8080/G:\\自媒体创作素材\\图片\\希腊神话图片素材\\3.png");

            urlConnection = (HttpURLConnection)url.openConnection();

            urlConnection.connect();

            is = urlConnection.getInputStream();
            fos = new FileOutputStream("day10\\5.jpg");

            byte[] buffer = new byte[1024];
            int len;
            while((len = is.read(buffer)) != -1){
                fos.write(buffer,0,len);
            }

            //完成后输出信息
            System.out.println("下载完成");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //关闭资源
            if(is != null){
                is.close();
            }
            if(fos != null){
                fos.close();
            }
            if(urlConnection != null){
                urlConnection.disconnect();
            }
        }
    }
}
