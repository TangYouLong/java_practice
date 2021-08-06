package com.atguigu.java1;

import java.util.List;

/**
 * @Author TYL
 * @Date 2021/8/4 10:56
 * @Version V1.0
 * @ClassName DAO
 * @Description TODO:
 *
 * DAO: data(base) access object
 */
public class DAO <T>{

    //添加一条记录
    public void add(T t){

    }

    //删除一条记录
    public boolean remove(int index){
        return false;
    }

    //修改一条记录
    public void update(int index,T t){

    }

    //查询多条记录
    public List<T> getForList(int index){
        return null;
    }

    //泛型方法
    //举例：
    public <E> E getValu(){
        return null;
    }
}
