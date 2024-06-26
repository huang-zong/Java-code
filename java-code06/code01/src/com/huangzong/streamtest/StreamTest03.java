package com.huangzong.streamtest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Function;
import java.util.stream.Stream;

public class StreamTest03 {
    public static void main(String[] args) {
        //stream流中间方法
        //创建集合
        ArrayList<String> list = new ArrayList<>();
        //添加元素
        Collections.addAll(list, "zhangsan", "lisi", "wangwu", "zhangqi");
        //过滤元素
        list.stream().filter(name -> name.startsWith("zhang")).forEach(name -> System.out.println(name));
        System.out.println("----------------------");

        //获取前几个元素
        list.stream().limit(3).forEach(name -> System.out.println(name));
        System.out.println("------------------");

        //跳过前几个元素
        list.stream().skip(2).forEach(name -> System.out.println(name));
        System.out.println("--------------------------");

        //获取中间几个元素
        list.stream().skip(1).limit(2).forEach(name -> System.out.println(name));
        System.out.println("------------------------");

        //元素去重
        ArrayList<String> list1 = new ArrayList<>();
        Collections.addAll(list1, "zhangsan", "zhangsan", "lisi", "wangwu");
        list1.stream().distinct().forEach(name -> System.out.println(name));
        System.out.println("---------------------");

        //合并两个流
        Stream.concat(list.stream(),list1.stream()).forEach(name-> System.out.println(name));
        System.out.println("---------------");

        //转换数据类型
        ArrayList<String> list2 = new ArrayList<>();
        Collections.addAll(list2, "zhang-1","li-2","wang-3");
        list2.stream().map(new Function<String, Object>() {
            @Override
            public Object apply(String s) {
                String[] split = s.split("-");
                int num = Integer.parseInt(split[1]);
                return num;
            }
        }).forEach(num-> System.out.println(num));
        System.out.println("--------------");
        //lambda表达式
        list2.stream().map(num->Integer.parseInt(num.split("-")[1])).forEach(num-> System.out.println(num));
    }
}
