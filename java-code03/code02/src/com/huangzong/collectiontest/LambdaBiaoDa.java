package com.huangzong.collectiontest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

public class LambdaBiaoDa {
    public static void main(String[] args) {
        //lambda表达式遍历
        //创建集合并添加元素
        Collection<String> coll = new ArrayList<>();
        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");
        coll.add("ddd");
        coll.add("eee");

        //匿名内部类形式
        /*coll.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });*/

        
        //lambda表达式
        coll.forEach(s-> System.out.println(s));
    }
}
