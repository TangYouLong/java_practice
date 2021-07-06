package com.atguigu.java;

/**
 * @Author TYL
 * @Date 2021/4/14 9:56
 * @Version V1.0
 * @ClassName ThreadTest1
 * @Description TODO:
 *1. 创建一个实现了Runnable接口的类
 *2. 实现类去实现Runnable中的抽象方法：run()
 *3. 创建实现类的对象
 *4. 将此对象作为参数传递到Thread类的构造器中，创建Thread类的对象
 *5. 通过Thread类的对象调用start()
 */
public class ThreadTest1 {
    public static void main(String[] args) {
        //3.创建实现类的对象
        Mthread mThread = new Mthread();
        //4.将此对象最为参数传递到Thread类的构造器中，创建Thread类的对象
        Thread t1 = new Thread(mThread);
        //5.通过Thread类的对象调用start()
        t1.start();
    }
}


//1.创建一个实现了Runnable接口的类
class Mthread implements Runnable{

    //2.实现类去实现Runnable中的抽象方法：run()
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}
