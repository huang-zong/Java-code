package com.huangzong.maptest;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class MapTest03 {
    public static void main(String[] args) {
        //创建集合
        Map<String , String> map = new HashMap<>();

        //添加元素
        map.put("zhangsan" , "zhangsan1");
        map.put("lisi" , "lisi1");
        map.put("wangwu" , "wangwu1");

        //lambda表达式遍历
        map.forEach((key, value)-> System.out.println(key + "=" + value));
    }
}
