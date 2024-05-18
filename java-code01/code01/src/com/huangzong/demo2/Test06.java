package com.huangzong.demo2;

import java.util.Scanner;

public class Test06 {
    public static void main(String[] args){
        //吃饭问题，键盘录入整数表示身上的钱，大于等于100就是网红餐厅，否则小吃

        //键盘录入身上的钱
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int money = sc.nextInt();

        //判断是否大于100
        if(money > 100){
            System.out.println("去网红餐厅");
        }else{
            System.out.println("去小吃");
        }

    }
}
