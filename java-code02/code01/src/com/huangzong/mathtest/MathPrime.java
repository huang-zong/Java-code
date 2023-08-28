package com.huangzong.mathtest;

import java.util.Scanner;

public class MathPrime {
    public static void main(String[] args) {
        //判断一个数是否为质数
        //键盘录入
        Scanner sc = new Scanner(System.in);
        //定义变量存储
        int number = sc.nextInt();
        boolean flag = isPrime(number);
        //输出结果
        System.out.println(flag);
    }

    //定义方法判断
    public static boolean isPrime(int number){
        //逻辑：一个数的因子必定是成对出现的，并且其中一个大于等于平方根，另一个小于等于平方根
        //循环计算,从2开始计算
        for (int i = 2; i <= Math.sqrt(number); i++){
            if (number % i == 0){
                return false;
            }
        }
        return true;
    }
}
