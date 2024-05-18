package com.huangzong.demo5;

import java.util.Random;

public class Test02 {
    public static void main(String[] args){
        //生产十个1-100的随机数，求和，求平均，统计多少个数小于平均
        //定义一个数组
        int[] arr3 = new int[10];
        //生成十个随机数存入数组
        Random r = new Random();
        for (int i = 0; i < 10; i++){
            arr3[i] = r.nextInt(100)+1;
        }
        int sum = 0;
        //遍历求和
        for (int i = 0; i < 10; i++){
            sum += arr3[i];
        }
        //求平均
        int av = sum / 10;
        int count = 0;
        //统计
        for (int i = 0; i < 10; i++){
            if(arr3[i] < av){
                count++;
            }
        }
        //输出结果
        System.out.println("和是" + sum);
        System.out.println("平均是" + av);
        System.out.println("个数是" + count);

    }
}