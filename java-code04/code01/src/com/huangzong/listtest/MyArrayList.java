package com.huangzong.listtest;

import java.util.Arrays;

/*
* 使用泛型编写类
* */
public class MyArrayList<E> {
    Object[] obj = new Object[10];
    int size;

    //定义添加方法
    public boolean add(E e){
        obj[size] = e;
        size++;
        return true;
    }

    public E get(int index){
        return (E)obj[index]; //强制转换为E类型
    }

    @Override
    public String toString() {
        return Arrays.toString(obj);
    }
}
