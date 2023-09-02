package com.huangzong.collectiontest;

import java.util.ArrayList;
import java.util.Collection;

public class ZengQiangFor {
    public static void main(String[] args) {
        //增强for
        //创建集合
        Collection<String> coll = new ArrayList<>();

        //添加元素
        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");
        coll.add("ddd");
        coll.add("eee");

        //增强for遍历
        for (String s : coll){
            System.out.println(s);
        }
    }
}
