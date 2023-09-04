package com.huangzong.settest;

import java.util.HashSet;

public class HashSetTest {
    public static void main(String[] args) {
        //使用哈希集合存储
        //创建学生对象
        Student stu1 = new Student("zhangsan" ,23);
        Student stu2 = new Student("wangwu" ,22);
        Student stu3 = new Student("lisi" ,25);
        Student stu4 = new Student("zhangsan" ,23);

        //创建集合并添加对象
        HashSet<Student> hs = new HashSet<>();
        System.out.println(hs.add(stu1));
        System.out.println(hs.add(stu2));
        System.out.println(hs.add(stu3));
        System.out.println(hs.add(stu4));

        //打印集合
        System.out.println(hs);
    }
}
