package com.huangzong.hashtest;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

public class StudentTest {
    public static void main(String[] args) {
        //创建hashmap集合
        HashMap<Student , String> map = new HashMap<>();

        //创建学生对象
        Student sut1 = new Student("zhangsan" , 23);
        Student sut2 = new Student("lisi" , 25);
        Student sut3 = new Student("wangwu" , 24);

        //添加元素
        map.put(sut1 , "jiangxi");
        map.put(sut2 , "hunan");
        map.put(sut3 , "hebei");


        //获取键值对对象
        Set<Map.Entry<Student, String>> entries = map.entrySet();
        //增强for遍历
        for (Map.Entry<Student, String> entry : entries) {
            //获取键
            Student key = entry.getKey();
            //获取值
            String value = entry.getValue();
            //打印结果
            System.out.println(key + "=" + value);
        }

        System.out.println("-------------------------------");
        //获取键值存入单列集合
        Set<Student> students = map.keySet();
        //迭代器遍历
        Iterator<Student> it = students.iterator();
        while (it.hasNext()){
            //获取键
            Student key = it.next();
            //根据键获取值
            String value = map.get(key);
            //打印结果
            System.out.println(key + "=" + value);
        }

        System.out.println("-------------------------------");
        //lambda表达式遍历
        map.forEach((key, value)->System.out.println(key + "=" + value));
    }
}
