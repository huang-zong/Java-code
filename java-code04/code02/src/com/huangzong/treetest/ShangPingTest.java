package com.huangzong.treetest;

import java.util.Comparator;
import java.util.TreeMap;

public class ShangPingTest {
    public static void main(String[] args) {
        //创建集合
        TreeMap<Integer , String> tm = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });

        //添加元素
        tm.put(123456, "shouji");
        tm.put(123475, "diannao");
        tm.put(123411, "shubiao");
        tm.put(123404, "yanjing");

        //打印集合,默认按照升序排序
        System.out.println(tm);
    }
}
