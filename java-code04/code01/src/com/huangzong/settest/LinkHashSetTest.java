package com.huangzong.settest;

import java.util.LinkedHashSet;

public class LinkHashSetTest {
    public static void main(String[] args) {
        //创建学生对象
        Student stu1 = new Student("zhangsan" ,23);
        Student stu2 = new Student("wangwu" ,22);
        Student stu3 = new Student("lisi" ,25);
        Student stu4 = new Student("zhangsan" ,23);

        //创建集合并添加对象
        LinkedHashSet<Student> lhs = new LinkedHashSet<>();

        System.out.println(lhs.add(stu1));
        System.out.println(lhs.add(stu2));
        System.out.println(lhs.add(stu3));
        System.out.println(lhs.add(stu4));

        //打印结果
        System.out.println(lhs);
    }
}
