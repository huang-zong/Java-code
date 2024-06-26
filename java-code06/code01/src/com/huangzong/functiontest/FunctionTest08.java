package com.huangzong.functiontest;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringJoiner;
import java.util.function.Function;
import java.util.stream.Stream;

public class FunctionTest08 {
    public static void main(String[] args) {
        //创建Student集合
        ArrayList<Student1> list = new ArrayList<>();
        //添加元素
        list.add(new Student1("zhangsan",23));
        list.add(new Student1("lisi",24));
        list.add(new Student1("wangwu",25));

        //将姓名和年龄拼接成字符串并放到数组中
        String[] array = list.stream().map(Student1::toString).toArray(String[]::new);
        System.out.println(Arrays.toString(array));
    }
}
