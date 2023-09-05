package com.huangzong.treetest;

import java.util.TreeMap;

public class StudentTest {
    public static void main(String[] args) {
        //创建集合
        TreeMap<Student , String> treeMap = new TreeMap<>();
        //创建学生对象
        Student sut1 = new Student("zhangsan" , 24);
        Student sut2 = new Student("lisi" , 21);
        Student sut3 = new Student("wangwu" , 25);

        //添加元素
        treeMap.put(sut1, "jianxi");
        treeMap.put(sut2, " henan");
        treeMap.put(sut3, "guangxi");

        //打印集合
        System.out.println(treeMap);
    }
}
