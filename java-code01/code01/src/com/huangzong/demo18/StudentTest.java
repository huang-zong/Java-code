package com.huangzong.demo18;

import java.util.ArrayList;

public class StudentTest {
    public static void main(String[] args) {
        //创建一个集合
        ArrayList<Student> list = new ArrayList<>();
        //创建学生对象
        Student stu1 = new Student("zhangsan", 14, "nan");
        Student stu2 = new Student("wangwu", 18, "nan");
        Student stu3 = new Student("lis", 34, "nan");
        //添加元素
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);
        //调用方法
        int maxAge = StudentUtil.getMaxAge(list);
        System.out.println(maxAge);
    }
}
