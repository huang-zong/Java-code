package com.huangzong.functiontest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionTest03 {
    public static void main(String[] args) {
        //引用构造方法
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张三,23", "王武器,25", "照亮吧,21", "活命啊,26");
        //封装成student对象并收集到list集合中
        list.stream().map(new Function<String, Student>() {
            @Override
            public Student apply(String s) {
                return new Student(s.split(",")[0], Integer.parseInt(s.split(",")[1]));
            }
        }).forEach(student -> System.out.println(student));
        System.out.println("----------------");

        //引用构造方法
        List<Student> list1 = list.stream().map(Student::new).collect(Collectors.toList());
        System.out.println(list1);
    }
}