package com.atguigu.java1;

/**
 * @Author TYL
 * @Date 2021/4/15 14:10
 * @Version V1.0
 * @ClassName BankTest
 * @Description TODO:使用同步机制将单例模式中的懒汉式改写为线程安全的
 */
public class BankTest {
}

class Bank{
    private Bank(){}

    private static Bank instance = null;

    public static Bank getInstance(){
        if(instance == null){
            instance = new Bank();
        }
        return instance;
    }

}