package com.atguigu.java;

/**
 * @Author TYL
 * @Date 2021/4/14 10:36
 * @Version V1.0
 * @ClassName WindosTest1
 * @Description TODO:
 * 例子：创建三个窗口卖票，总票数为100张，使用实现Runnable接口的方式
 */
public class WindosTest1 {
    public static void main(String[] args) {

        Window1 w = new Window1();

        Thread t1 = new Thread(w);
        Thread t2 = new Thread(w);
        Thread t3 = new Thread(w);

        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");

        t1.start();
        t2.start();
        t3.start();


    }
}

class Window1 implements Runnable{

    private int ticket = 100;

    @Override
    public void run() {
        while (true){
            if (ticket > 0){
                System.out.println(Thread.currentThread().getName() + "票号为" + ticket);
                ticket--;
            }
        }
    }
}