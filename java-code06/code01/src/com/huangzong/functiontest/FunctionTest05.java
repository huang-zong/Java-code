package com.huangzong.functiontest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.IntFunction;

public class FunctionTest05 {
    public static void main(String[] args) {
        //引用数组的构造方法
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1,3,4,5,6,7,9);

        //存储到数组
        Integer[] array = list.stream().toArray(new IntFunction<Integer[]>() {
            @Override
            public Integer[] apply(int value) {
                return new Integer[value];
            }
        });
        System.out.println(Arrays.toString(array));
        System.out.println("----------------------");

        //引用数组的构造方法
        Integer[] array1 = list.stream().toArray(Integer[]::new);
        System.out.println(Arrays.toString(array1));
    }
}
