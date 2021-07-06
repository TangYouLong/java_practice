package com.atguigu.java2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author TYL
 * @Date 2021/4/19 17:06
 * @Version V1.0
 * @ClassName ThreadPool
 * @Description TODO:
 * 创建线程的方式4：线程池
 */
public class ThreadPool {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(10);

    }
}

class NumberThread implements Runnable{
    @Override
    public void run() {
        for(int i = 0;i <= 100;i++){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}
