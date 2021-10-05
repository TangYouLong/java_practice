package com.atguigu.java2;

import com.atguigu.java1.Person;
import org.junit.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * @Author Tang YouLong
 * @Date 2021/10/2 17:37
 * @Version V1.0
 * @ClassName MethodTest
 * @Description TODO:
 *
 * 获取运行时类的方法结构
 */
public class MethodTest {

    @Test
    public void test1(){
        Class clazz = Person.class;

        //getMethods():获取当前运行时类及其所有父类中声明为public权限的方法
        Method[] methods = clazz.getMethods();
        for(Method m : methods){
            System.out.println(m);
        }

        System.out.println();

        //getDeclaredMethods():获取当前运行时类当中的所有方法
        Method[] declaredMethods = clazz.getDeclaredMethods();
        for(Method m : declaredMethods){
            System.out.println(m);
        }
    }

    /*
    权限修饰符 返回值类型 方法名（参数类型 形参名）throws ?Exception{}
     */
    @Test
    public void test2(){
        Class clazz = Person.class;
        Method[] declaredMethods = clazz.getDeclaredMethods();
        for (Method m : declaredMethods){
            //1.获取方法声明的注解
            Annotation[] annos = m.getAnnotations();
            for(Annotation a : annos){
                System.out.println(a);
            }

            //2.权限修饰符
            System.out.print(Modifier.toString(m.getModifiers()) + "\t");

            //3.返回值类型
            System.out.print(m.getReturnType().getName() + "\t");

            //4.方法名
            System.out.print(m.getName());
            System.out.print("(");
            //5.形参
            Class[] parameterTypes = m.getParameterTypes();
            if(!(parameterTypes == null && parameterTypes.length == 0)){
                for (int i = 0;i < parameterTypes.length;i++){
                    System.out.print(parameterTypes[i].getName() + " args " + i);
                }
            }
            System.out.print(")");

            //6.抛出的异常
            Class[] exceptionTypes = m.getExceptionTypes();
            if(exceptionTypes.length > 0){
                System.out.print("throws ");
                for (int i = 0;i < exceptionTypes.length;i++){
                    System.out.print(exceptionTypes[i].getName());
                }
            }


            System.out.println();
        }
    }
}
