package com.huangzong.streamtest;

import java.util.*;
import java.util.stream.Stream;

public class StreamTest02 {
    public static void main(String[] args) {
        //单列集合使用
        ArrayList<String> list = new ArrayList<>();
        //添加元素
        Collections.addAll(list, "zhangsan", "lisi", "wangwu");
        //stream流
        list.stream().forEach(s -> System.out.println(s));
        System.out.println("--------------------------");

        //双列集合无法直接使用
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("zhangsan", 1);
        hm.put("lisi", 2);
        hm.put("weuwang", 3);
        //获取所有键值
        Set<String> keys = hm.keySet();
        keys.stream().forEach(s -> System.out.println(s));
        System.out.println("-------------------------------");

        //获取键值对
        Set<Map.Entry<String, Integer>> entries = hm.entrySet();
        entries.stream().forEach(s -> System.out.println(s));
        System.out.println("----------------------------------");

        //数组使用Arrays工具类方法
        String[] arr = new String[]{"zhangsan", "lisi", "wangwu"};
        Arrays.stream(arr).forEach(s -> System.out.println(s));
        System.out.println("-------------------------------------");

        //零散数据
        Stream.of(1, 2, 3, 4, 5, 6).forEach(s -> System.out.println(s));

    }
}
