package com.huangzong.functiontest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Function;

public class FunctionTest04 {
    public static void main(String[] args) {
        //类名：：成员方法
        //创建集合存储
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list , "aaa","bbb","ccc","ddd");
        //转换成大大写
        list.stream().map(new Function<String, String>() {
            @Override
            public String apply(String s) {
                return s.toUpperCase();
            }
        }).forEach(s -> System.out.println(s));
        System.out.println("-----------");

        //类名：：成员方法
        list.stream().map(String::toUpperCase).forEach(s -> System.out.println(s));
    }
}
