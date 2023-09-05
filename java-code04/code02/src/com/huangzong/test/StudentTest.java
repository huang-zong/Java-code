package com.huangzong.test;

import java.util.TreeSet;

public class StudentTest {
    public static void main(String[] args) {
        //创建学生对象
        Student stu1 = new Student("zhangsan" , 23 , 89 , 94 , 50);
        Student stu2 = new Student("lisi" , 23 , 79 , 90 , 53);
        Student stu3 = new Student("wangwu" , 26 , 81 , 94 , 50);
        Student stu4 = new Student("zhaolou" , 24 , 87 , 90 , 70);
        Student stu5 = new Student("hanbai" , 20 , 89 , 94 , 50);

        //创建集合
        TreeSet<Student> ts = new TreeSet<>();
        //添加元素
        ts.add(stu1);
        ts.add(stu2);
        ts.add(stu3);
        ts.add(stu4);
        ts.add(stu5);

        //打印结果
        //System.out.println(ts);
        //增强for遍历
        for (Student t : ts) {
            System.out.println(t);
        }
    }
}
