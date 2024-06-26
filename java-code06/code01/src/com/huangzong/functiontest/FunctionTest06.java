package com.huangzong.functiontest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FunctionTest06 {
    public static void main(String[] args) {
        //集合存储数据，收集到Student数组中
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张三,23", "王武器,25", "照亮吧,21", "活命啊,26");

        //将字符串变成Student对象，再收集
        Student[] array = list.stream().map(Student::new).toArray(Student[]::new);
        System.out.println(Arrays.toString(array));
    }
}
