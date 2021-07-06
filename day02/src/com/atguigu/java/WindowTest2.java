package com.atguigu.java;

/**
 * @Author TYL
 * @Date 2021/4/15 9:55
 * @Version V1.0
 * @ClassName WindowTest2
 * @Description TODO:
 */

public class WindowTest2 {
    public static void main(String[] args) {
        Window2 t1 = new Window2();
        Window2 t2 = new Window2();
        Window2 t3 = new Window2();

        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");

        t1.start();
        t2.start();
        t3.start();
    }
}

class Window2 extends Thread{
    private static int ticket = 100;

    @Override
    public void run() {
        while(true){
            if(ticket > 0){
                System.out.println(Thread.currentThread().getName() + "票号为：" + ticket);
                ticket--;
            }else{
                break;
            }
        }
    }
}
