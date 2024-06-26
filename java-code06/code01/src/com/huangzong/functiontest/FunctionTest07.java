package com.huangzong.functiontest;

import java.util.ArrayList;
import java.util.Arrays;

public class FunctionTest07 {
    public static void main(String[] args) {
        //创建Student集合
        ArrayList<Student> list = new ArrayList<>();
        //添加元素
        list.add(new Student("zhangsan",23));
        list.add(new Student("lisi",24));
        list.add(new Student("wangwu",25));

        //获取姓名并存储到数组
        String[] array = list.stream().map(Student::getName).toArray(String[]::new);
        System.out.println(Arrays.toString(array));
    }
}
