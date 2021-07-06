package com.atguigu.java;

/**
 * @Author TYL
 * @Date 2021/4/15 10:51
 * @Version V1.0
 * @ClassName WindowTest3
 * @Description TODO:
 */
public class WindowTest3 {
    public static void main(String[] args) {

        Window3  w = new Window3();

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

class Window3 implements Runnable{
    private static int ticket = 100;

    @Override
    public void run() {
        while (true) {
            show();
        }
    }


    private synchronized void show(){
            if(ticket > 0){
                System.out.println(Thread.currentThread().getName() + "票号为：" + ticket);
                ticket--;
            }
        }
}
