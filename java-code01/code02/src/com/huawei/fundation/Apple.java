package com.huawei.fundation;

import java.util.Arrays;
import java.util.Scanner;

public class Apple {
    public static void main(String[] args){
        //分苹果，A使用二进制异或运算，B使用十进制运算


        Scanner sc = new Scanner(System.in);
        //键盘录入苹果数量
        int num = sc.nextInt();
        //键盘录入苹果重量，数组存储
        //创建数组
        int[] appleArr = new int[num];
        for (int i = 0; i < num; i++){
            appleArr[i] = sc.nextInt();

        }
        //输出所有苹果的异或值
        //临时变量存储A的异或值
        int count = appleArr[0];
        //循环从下标1开始，从0开始则情况是arr[0]^arr[0]^arr[1]...
        for (int i = 1; i < num; i++){
            count ^= appleArr[i];
        }

        //B最后得到的重量，如果最大返回结果，否则返回-1
        int result = -1;

        //苹果总重量
        int sum = 0;

        //苹果中最小的重量与其他苹果异或值为零，求出最小的苹果重量按照A的方法分给A，剩下的给B，则B得到的重量最大
        //当异或值为0时，满足了A的要求，此时可以分配苹果
        if (count == 0){
            //调用方法得到最小值
            int min = Arrays.stream(appleArr).min().getAsInt();

            sum = Arrays.stream(appleArr).sum();

            //总重量减去A得到的最小的苹果
            result = sum - min;
        }
        //输出结果
        System.out.println(result);

    }
}
