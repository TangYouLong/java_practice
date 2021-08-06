package com.atguigu.java3;

import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.Date;

/**
 * @Author TYL
 * @Date 2021/8/5 15:57
 * @Version V1.0
 * @ClassName FileTest
 * @Description TODO:
 *
 * File类的使用
 * 1.File类的一个对象，代表一个文件或一个文件目录（俗称：文件夹）
 * 2.File类声明在java.io包下
 */
public class FileTest {

      /*
      1.如何创建File类的实例
      File(String filePath)
      File(String parentPath,String childPath)
      File(File parentFile,String child)

      2.使用文件路径创建
      分为相对路径：
      绝对路径：

      3.路径分隔符
      windows:\\
      unix:/
       */


    @Test
    public void test1(){
        //构造器1
        File file = new File("hello.txt");//相对于当前module
        File file1 = new File("D:\\normal file\\爱因斯坦文集第1卷.pdf");//绝对路径

        //构造器2
        File file3 = new File("D:\\normal file","1");

        //构造器3
        File file4 = new File(file3,"1.txt");
    }

    //常用方法
    @Test
    public void test2(){
        /*
        public String getAbsolutePath() 获取绝对路径
        public String getPath() 获取路径
        public String getName() 获取名称
        public String getParent() 获取上层文件目录路径，如果无，返回null
        public long length() 获取文件长度
        public long lastModified() 获取最后一次修改时间，毫秒值

        public String[] list() 获取指定目录下的所有文件或者文件目录的名称数组
        public File[] listFiles() 获取指定目录下的所有文件或者文件目录下的File数组

         */


        File file1 = new File("hello.txt");
        File file2 = new File("D:\\normal file\\爱因斯坦文集第1卷.pdf");

        System.out.println(file1.getAbsoluteFile());
        System.out.println(file1.getPath());
        System.out.println(file1.getName());
        System.out.println(file1.getParent());
        System.out.println(file1.length());
        System.out.println(new Date(file1.lastModified()));

        System.out.println();

        System.out.println(file2.getAbsoluteFile());
        System.out.println(file2.getPath());
        System.out.println(file2.getName());
        System.out.println(file2.getParent());
        System.out.println(file2.length());
        System.out.println(new Date(file2.lastModified()));
    }

    @Test
    public void test3(){
        File file = new File("D:\\gitspace\\workspace_idea1\\JavaSenior");

        String[] list = file.list();
        for(String s : list){
            System.out.println(s);
        }

        File[] files = file.listFiles();
        for (File f : files){
            System.out.println(f);
        }
    }

    /*
    public boolean renameTo(File dest):把文件重命名为指定的文件路径
    file1.renameTo(File)
    要想重命名成功，file1要在硬盘中是存在的，且file2不能在硬盘中存在
     */

    @Test
    public void test4(){
        File file1 = new File("hello.txt");
        File file2 = new File("1.txt");

        boolean renameTo = file1.renameTo(file2);
        System.out.println(renameTo);
    }

    /*
    public boolean isDirectory()：判断是否是文件目录
    public boolean isFile() ：判断是否是文件
    public boolean exists() ：判断是否存在
    public boolean canRead() ：判断是否可读
    public boolean canWrite() ：判断是否可写
    public boolean isHidden() ：判断是否隐藏
     */

    @Test
    public void test5(){
        File file1 = new File("1.txt");

        System.out.println(file1.isDirectory());
        System.out.println(file1.isFile());
        System.out.println(file1.exists());
        System.out.println(file1.canRead());
        System.out.println(file1.canWrite());
        System.out.println(file1.isHidden());
    }

    /*
    public boolean createNewFile() ：创建文件。若文件存在，则不创建，返回false
    public boolean mkdir() ：创建文件目录。如果此文件目录存在，就不创建了。
    如果此文件目录的上层目录不存在，也不创建。
    public boolean mkdirs() ：创建文件目录。如果上层文件目录不存在，一并创建
     */

    @Test
    public void test6() throws IOException {
        //文件的创建
        File file1 = new File("hi.txt");
        if(!file1.exists()){
            file1.createNewFile();
            System.out.println("创建成功");
        }else{
            file1.delete();
            System.out.println("删除成功");
        }
    }

    @Test
    public void test7(){
        //文件目录的创建
        File file1 = new File("D:\\normal file\\1");
        boolean mkdir = file1.mkdir();
    }

    
}



