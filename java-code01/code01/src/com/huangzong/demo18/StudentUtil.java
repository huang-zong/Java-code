package com.huangzong.demo18;

import java.util.ArrayList;

public class StudentUtil {
    //私有化方法，避免创建对象
    private StudentUtil(){}

    //定义一个方法获取集合的最大学生年龄
    public static int getMaxAge(ArrayList<Student> list){
        int max = list.get(0).getAge();
        for (int i = 1; i < list.size(); i++) {
            int age = list.get(i).getAge();
            if (age > max){
                max = age;
            }
        }
        return max;
    }
}
