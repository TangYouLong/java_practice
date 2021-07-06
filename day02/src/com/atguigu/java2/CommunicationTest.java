package com.atguigu.java2;

/**
 * @Author TYL
 * @Date 2021/4/16 13:45
 * @Version V1.0
 * @ClassName CommunicationTest
 * @Description TODO:线程通信的例子：使用两个线程打印1-100.线程1，线程2交替打印
 */
public class CommunicationTest {
    public static void main(String[] args) {
        Number number = new Number();
        Thread t1 = new Thread(number);
        Thread t2 = new Thread(number);

        t1.setName("线程1");
        t2.setName("线程2");

        t1.start();
        t2.start();
    }
}

class Number implements Runnable{
    private int number = 1;
    @Override
    public void run() {
        while(true) {
            synchronized (this) {
                if (number < 100) {
                    notifyAll();
                    System.out.println(Thread.currentThread().getName() + " " + number);
                    number++;
                    try {
                        //使得调用如下wait方法的线程，进入阻塞状态
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
