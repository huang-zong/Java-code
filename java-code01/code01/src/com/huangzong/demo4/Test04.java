package com.huangzong.demo4;

import java.util.Random;
import java.util.Scanner;

public class Test04 {
    public static void main(String[] args){
        //猜数字小游戏，在1-100之间，猜小了提升：小了，
        //生成随机数
        Random r = new Random();
        int guessNumber = r.nextInt(100)+1;//保证范围在1-100
        //键盘输入数字
        Scanner sc = new Scanner(System.in);
        //while循环，if条件判断
        while(true){
            System.out.println("请输入数字");
            int number = sc.nextInt();
            if (guessNumber == number){
                System.out.println("猜中了");
                break;
            }else if(guessNumber < number){
                System.out.println("大了");
            }else{
                System.out.println("小了");
            }
        }
    }
}
