package com.huangzong.collectiontest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorTest {
    public static void main(String[] args) {
        //迭代器

        //创建集合
        Collection<String> coll = new ArrayList<>();

        //添加元素
        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");
        coll.add("ddd");
        coll.add("eee");

        //获取迭代器对象
        Iterator<String> it = coll.iterator();
        //循环获取每一个元素
        while (it.hasNext()){ //hasNext 确定集合是否存在元素
            //获取元素并移动指针
            String str = it.next();
            System.out.println(str);
        }
    }
}
