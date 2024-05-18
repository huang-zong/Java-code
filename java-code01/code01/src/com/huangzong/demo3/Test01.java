package com.huangzong.demo3;

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args){
        //影院选座问题，票号为奇数坐左侧，偶数坐右侧，票号在1-100

        //键盘录入票号
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入票号");
        int number = sc.nextInt();

        //判断票号区间
        if(number > 0 && number <= 100){
            //模2判断奇数还是偶数
            if(number % 2 == 0){
                System.out.println("右侧");
            }else{
                System.out.println("左侧");
            }
        }

    }
}
