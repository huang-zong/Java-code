package com.huangzong.streamtest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ShuJuGuoLv {
    public static void main(String[] args) {
        //过滤数字
        //创建集合存储初始数据
        ArrayList<Integer> list = new ArrayList<>();
        //添加元素
        Collections.addAll(list, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        //过滤数据
        List<Integer> newList = list.stream()
                .filter(num -> num % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(newList);
    }
}
