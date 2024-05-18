package com.huangzong.demo2;

public class Test05 {
    public static void main(String[] args){
        //比较和尚的身高，使用三元运算符获得最高身高

        //定义初始化三个和尚的身高
        int number1 = 150 , number2 = 210 , number3 = 165;

        //比较身高
        int max = number1 > number2 ? number1 : number2;
        max = max > number3 ? max : number3;

        //输出最高的身高
        System.out.println(max);
    }
}
