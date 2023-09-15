package com.huangzong.streamtest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.stream.Collectors;

public class ZiFuChuanGuoLv {
    public static void main(String[] args) {
        //过滤字符串，保留年龄大于等于24岁，存到map集合
        ArrayList<String> list = new ArrayList<>();
        //添加元素
        Collections.addAll(list, "zhangsan,25", "lisi,21", "wangwu,24");
        //保留年龄大于等于24的
        Map<String, Integer> map = list.stream()
                .filter(age -> Integer.parseInt(age.split(",")[1]) >= 24)
                .collect(Collectors.toMap(key -> key.split(",")[0],
                        value -> Integer.parseInt(value.split(",")[1])));
        System.out.println(map);
    }
}
