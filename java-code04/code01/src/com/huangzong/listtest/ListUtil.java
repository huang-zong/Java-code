package com.huangzong.listtest;

import java.util.ArrayList;

public class ListUtil {

    //空参构造
    private ListUtil(){}

    //泛型方法
    public static <E> void  addAll(ArrayList<E> list , E...e){
        for (E element : e){
            list.add(element);
        }
    }
}
