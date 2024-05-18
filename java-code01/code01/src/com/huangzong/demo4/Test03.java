package com.huangzong.demo4;

import java.util.Scanner;

public class Test03 {
    public static void main(String[] args){
        //质数问题，1-number-1内的所有数字不能整除number可以认为是质数
        //键盘录入一个整数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int number = sc.nextInt();
        //标记一个变量
        boolean flag = true;
        //从1开始进行for循环
        for (int i = 2 ; i < number ; i++){
            if(number % i == 0){
                flag = false;
                break;
            }
        }
        //if条件判断
        if(flag){
            System.out.println(number + "是一个质数");
        }else{
            System.out.println(number + "不是一个质数");
        }
    }
}
