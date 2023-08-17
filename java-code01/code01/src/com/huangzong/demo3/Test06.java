package com.huangzong.demo3;

import com.sun.jdi.PathSearchingVirtualMachine;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Test06 {
    public static void main(String[] args){
        //回文数问题
        //键盘录入一个整数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数字");
        int number = sc.nextInt();
        int temp = number;
        int result = 0;
        //while循环得到每位数字
        while(number != 0){
            int wei = number % 10;
            number /= 10;
            result = result * 10 + wei;
        }

        //if判断是否是回文数
        System.out.println(result == temp);

    }
}
