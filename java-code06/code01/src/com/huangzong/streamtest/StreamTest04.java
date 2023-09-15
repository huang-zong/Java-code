package com.huangzong.streamtest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.Consumer;
import java.util.function.IntFunction;

public class StreamTest04 {
    public static void main(String[] args) {
        //stream流终结方法
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"zhangsan","lisi","wangwu","zhaoliu");
        //foreach方法
        list.stream().forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
        System.out.println("------------------------");
        //lambda
        list.stream().forEach(s-> System.out.println(s));
        System.out.println("--------------------------");

        //count统计
        long count = list.stream().count();
        System.out.println(count);
        System.out.println("-----------------------------");

        //toArray收集数据放到数组中
        String[] array = list.stream().toArray(new IntFunction<String[]>() {
            @Override
            public String[] apply(int value) {
                return new String[value];
            }
        });
        System.out.println(Arrays.toString(array));
        System.out.println("----------------------------");
        //lambda
        String[] array1 = list.stream().toArray(value -> new String[value]);
        System.out.println(Arrays.toString(array1));

    }
}
