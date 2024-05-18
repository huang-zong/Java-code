package com.huangzong.demo2;

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args){
        //键盘录入一个三位数，得到个、十、百位数字

        //键盘录入数据
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个三位数");
        int number = sc.nextInt();

        //模10得到个位数
        //除以10再模10得到十位数
        //除以100再模10得到百位数
        int ge = number%10;
        int shi = number/10%10;
        int bai = number/100%10;

        //输出结果

        System.out.println("个位数是"+ge);
        System.out.println("十位数是"+shi);
        System.out.println("百位数是"+bai);
    }
}
