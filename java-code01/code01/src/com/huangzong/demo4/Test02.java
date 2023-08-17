package com.huangzong.demo4;

import java.util.Scanner;

public class Test02 {
    public static void main(String[] args){
        //求平方根问题
        //键盘录入一个大于等于2的数字
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数字");
        int number = sc.nextInt();

        //使用for循环计算平方根，if条件判断
        for(int i = 1 ; i < number ; i++){
            if(i * i == number) {
                System.out.println("平方根是" + i);
                //找到数据就退出循环
                break;
            } else if (i * i > number) {
                System.out.println("平方根是" + (i - 1));
                break;
            }
        }
    }
}
