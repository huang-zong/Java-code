package com.huangzong.lambda;

import java.util.Arrays;
import java.util.Comparator;

public class LambdaTest02 {
    public static void main(String[] args) {
        //定义数字并存储一些字符串，利用Arrays中的sort方法进行排序
        String[] arr = new String[]{"a", "aaaa", "aa", "aaa"};

        //lambda表达式省略
        Arrays.sort(arr, (o1, o2)-> o1.length() - o2.length());

        System.out.println(Arrays.toString(arr));
    }
}
