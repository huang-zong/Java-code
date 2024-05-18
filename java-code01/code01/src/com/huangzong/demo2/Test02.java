package com.huangzong.demo2;

import java.util.Scanner;

public class Test02 {
    public static void main(String[] args){
        //相亲问题，时髦度匹配

        //键盘录入你的时髦度
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的时髦度");
        int number1 = sc.nextInt();

        //键盘录入相亲对象的时髦度
        System.out.println("请输入相亲对象的时髦度");
        int number2 = sc.nextInt();

       //比较两人的时髦度，如果你的时髦度大于对方输出true，否则输出false
        boolean result = number1 > number2;
        System.out.println(result);
//        if(number1 > number2){
//            System.out.println(true);
//        }
//        else{
//            System.out.println(false);
//        }
    }
}
