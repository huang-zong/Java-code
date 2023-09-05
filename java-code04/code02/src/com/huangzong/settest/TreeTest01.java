package com.huangzong.settest;

import java.util.TreeSet;

public class TreeTest01 {
    public static void main(String[] args) {
        //创建学生对象
        Student stu1 = new Student("zhangsan", 23);
        Student stu2 = new Student("lisi" ,21);
        Student stu3 = new Student("wangwu",25);

        //创建集合
        TreeSet<Student> ts = new TreeSet<>();

        //添加元素
        ts.add(stu1);
        ts.add(stu2);
        ts.add(stu3);

        //打印结果
         System.out.println(ts);
    }
}
