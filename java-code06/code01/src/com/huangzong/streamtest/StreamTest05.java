package com.huangzong.streamtest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamTest05 {
    public static void main(String[] args) {
        //stream流收集
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "zhangsan-nan-23", "lisi-nv-22", "wangwu-nan-32");

        //把所有男性收集到list集合
        list.stream()
                .filter(s -> "nan".equals(s.split("-")[1]))
                .collect(Collectors.toList())
                .forEach(s -> System.out.println(s));
        System.out.println("--------------------");

        //把所有男性收集到set集合
        list.stream()
                .filter(s -> "nan".equals(s.split("-")[1]))
                .collect(Collectors.toSet())
                .forEach(s -> System.out.println(s));
        System.out.println("-----------------------------");

        //把所有男性收集到map集合
        //键值：姓名 值：年来
        Map<String, Integer> map = list.stream()
                .filter(s -> "nan".equals(s.split("-")[1]))
                .collect(Collectors.toMap(new Function<String, String>() {
                    @Override
                    public String apply(String s) {
                        return s.split("-")[0];
                    }
                }, new Function<String, Integer>() {
                    @Override
                    public Integer apply(String s) {
                        return Integer.valueOf(s.split("-")[2]);
                    }
                }));

        System.out.println(map);
        System.out.println("--------------");
        //lambda
        Map<String, String> map1 = list.stream()
                .filter(s -> "nan".equals(s.split("-")[1]))
                .collect(Collectors.toMap(s -> s.split("-")[0], s -> s.split("-")[2]));
        System.out.println(map1);
    }
}
