package com.atguigu.java;

import java.io.FileInputStream;
import java.util.Properties;

/**
 * @Author TYL
 * @Date 2021/7/28 14:20
 * @Version V1.0
 * @ClassName PropertiesTest
 * @Description TODO:
 */
public class PropertiesTest {

    //Properties：常用来处理配置文件。key和value都是String类型
    public static void main(String[] args) throws Exception{
        Properties pros = new Properties();

        FileInputStream fis = new FileInputStream("jdbc.properties ");
        pros.load(fis);//加载流对应的文件
        String name = pros.getProperty("name");
        String password = pros.getProperty("password");

        System.out.println("name = " + name + " " + "password = " + password);
    }
}
