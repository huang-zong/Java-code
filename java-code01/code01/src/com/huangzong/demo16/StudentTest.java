package com.huangzong.demo16;

import java.util.ArrayList;

public class StudentTest {
    public static void main(String[] args) {
        //ArrayList
        //创建集合
        ArrayList<Student> list = new ArrayList<>();
        //创建学生对象
        Student stu1 = new Student("zhangsan",14);
        Student stu2 = new Student("lisi",17);
        Student stu3 = new Student("wangwu",18);
        //添加元素
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);
        //遍历
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println(stu.getName() + "," + stu.getAge());
        }
    }
}
