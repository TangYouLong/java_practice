package com.atguigu.java1;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author TYL
 * @Date 2021/4/15 16:58
 * @Version V1.0
 * @ClassName LockTest
 * @Description TODO:解决线程安全问题的方式3-Lock锁，JDK5.0新增
 */
public class LockTest {
    public static void main(String[] args) {
        Window w = new Window();

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

class Window implements Runnable{
    private int ticket = 100;
    //
    private ReentrantLock lock = new ReentrantLock();

    @Override
    public void run() {
        while(true){
            try{
                //2.调用lock
                lock.lock();
                if(ticket > 0){
                    System.out.println(Thread.currentThread().getName() + "票号为" + ticket);
                    ticket--;
                }
            }finally {
                lock.unlock();
            }
        }

    }
}