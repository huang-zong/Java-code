package com.huangzong.demo2;

import java.util.Scanner;

public class Test03 {
    public static void main(String[] args){
        //键盘录入两个数字，判断
        //如果其中一个是6，则输出true，如果两个数字和是6的背熟也输出true，否则输出false

        //键盘录入两个数字
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数字");
        int number1 = sc.nextInt();
        System.out.println("请输入一个数字");
        int number2 = sc.nextInt();

        //判断是否输入6
        //判断两个和模6是否为0
        boolean result = number1 == 6 || number2 ==6 || (number1 + number2)%6 == 0;

        //输出结果
        System.out.println(result);
    }
}
