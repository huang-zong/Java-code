package com.huangzong.mathtest;

import java.util.Scanner;

public class MathZiMin {
    public static void main(String[] args){
        //统计自幂数个数
        //键盘录入要统计的自幂数位数
        Scanner sc = new Scanner(System.in);
        int wei = sc.nextInt();
        //获得上下界
        double low = Math.pow(10, wei - 1);
        double height = Math.pow(10, wei) - 1;
        //调用方法
        int count = getZiMiShu(low , height , wei);
        //输出
        System.out.println(count);
    }

    //定义方法统计自幂数个数
    public static int getZiMiShu(double low , double height , int wei){
        //定义变量统计
        int count = 0;
        //循环统计自幂数
        for (int i =(int) low; i <= height; i++){
            int  index = i;
            double temp = 0;
            while (index > 0){
                int ge = index % 10;
                temp += Math.pow(ge, wei);
                index /= 10;
            }
            if (i == temp){
                count++;
            }
        }
        return count;
    }
}
