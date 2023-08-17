package com.huangzong.demo6;

import java.util.Scanner;

public class Test05 {
    public static void main(String[] args) {
        //买飞机票，要求输入机票原价，月份和头等舱或经济舱
        //键盘录入原价，月份，头等舱或经济舱
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入原价");
        double price = sc.nextInt();
        System.out.println("请输入月份");
        int month = sc.nextInt();
        System.out.println("请输入0 头等舱,1 经济舱");
        int seat = sc.nextInt();
        //判断月份
        if (month >= 5 && month <= 10){
            //旺季
            price = getPrice(price, seat, 0.9,0.85);
        } else if ((month >=1 && month <=4) || (month >=11 && month <= 12)) {
            //淡季
           price = getPrice(price, seat, 0.7,0.65);
        }else {
            System.out.println("输入的月份非法");
        }
        //输出结果
        System.out.println(price);
    }
    //定义一个方法计算票价 传入原价，是否头等舱，折扣
    public static double getPrice(double price, int seat, double v1, double v2){
        if(seat == 0){
            //头等舱
            price = price * v1;
        }else if (seat == 1){
            //经济舱
            price = price * v2;
        }else{
            System.out.println("没有这个仓位");
        }
        return price;
    }
}
