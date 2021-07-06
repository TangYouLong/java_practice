package com.atguigu.java;

/**
*@Author: TYL
*@Date: 2021-04-12 17:05:33
*@Version: V1.0
*@ClassName: ThreadTest
*@Description TODO:创建多线程的练习
 * 方式1：继承Thread类
 * 1.创建一个继承于Thread类的子类
 * 2. 重写Thread类的run() --> 将此线程执行的操作声明在run()中
 * 3. 创建Thread类的子类的对象
 * 4. 通过此对象调用start()方法
*/
public class ThreadTest{
    public static void main(String[] args) {
        //3. 创建Thread类的子类的对象
        MyThread t1 = new MyThread();
        //4. 通过此对象调用start()方法:1.启动当前线程 2.调用当前线程的run()
        t1.start();

        //问题1：不能通过直接调用run()方法的方式启动线程
        //t1.run();

        //问题2：再启动一个线程，遍历100以内的偶数。不可以还让已经start()的线程去执行，会报会报IllegalThreadStateException
        //t1.start();
        //我们需要重新创建一个线程的对象
        MyThread t2 = new MyThread();
        t2.start();

        //如下操作仍然是在main线程中执行的
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0){
                System.out.println(i + "*");
            }
        }
    }
}

//1.创建一个继承于Thread类的子类
class MyThread extends Thread{
    //2.重写Thread类的run()
    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}