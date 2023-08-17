package com.huangzong.demo2;

import java.util.Scanner;

public class Test04 {
    public static void main(String[] args){
        //键盘录入两只老虎的体重进行比较，如果相同输出相同,否则输出不同

        //键盘录入两只老虎的体重
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一只老虎的体重");
        int number1 = sc.nextInt();
        System.out.println("请输入一只老虎的体重");
        int number2 = sc.nextInt();

        //三元运算符进行比较
        String result = number1 == number2 ? "相同" : "不同";
        

        //输出结果
        System.out.println(result);
    }
}
