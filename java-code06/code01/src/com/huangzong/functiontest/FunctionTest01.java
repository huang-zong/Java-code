package com.huangzong.functiontest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Function;

public class FunctionTest01 {
    public static void main(String[] args) {
        //方法引用
        //创建集合存储初始数据
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "1","2","3","4","5");

        //转换为整数
        list.stream().map(new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return Integer.parseInt(s);
            }
        }).forEach(s-> System.out.println(s));
        System.out.println("--------------");

        //方法引用
        list.stream().map(Integer::parseInt).forEach(s-> System.out.println(s));
    }
}
