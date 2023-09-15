package com.huangzong.streamtest;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class StreamTest01 {
    public static void main(String[] args) {
        //测试Stream流
        //创建集合
        ArrayList<String> list = new ArrayList<>();
        //添加元素
        Collections.addAll(list, "张无忌", "周芷若", "赵敏", "张强", "张三丰");

        //获取以张开头的字符串存到新集合
        ArrayList<String> list1 = new ArrayList<>();
        for (String name : list) {
            if (name.startsWith("张")) {
                list1.add(name);
            }
        }

        //获取以张开头长度为3的字符串存到新集合
        ArrayList<String> list2 = new ArrayList<>();
        for (String name : list1) {
            if (name.length() == 3) {
                list2.add(name);
            }
        }

        //打印结果
        System.out.println(list2);

        System.out.println("-----------------------");

        //使用stream流完成要求
        list.stream().filter(name -> name.startsWith("张")).filter(name -> name.length() == 3).forEach(name -> System.out.println(name));

    }
}
