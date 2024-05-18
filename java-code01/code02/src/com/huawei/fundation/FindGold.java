package com.huawei.fundation;

import java.util.Scanner;

public class FindGold {
    public static void main(String[] args){
        //找黄金宝箱，编号0~N的箱子，每个箱子贴着一个数字，第一个箱子左侧和为0，最后一个箱子右侧和为0
        //宝箱左边数字之和等于右边数字之和，求出所有宝箱数字之和，左边left+数字，右边right=sum-数字
        //键盘录入字符串
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        //将字符串去","变成数字存入数组
        //定义一个字符串数组
        String[] str1 = str.split(",");
        //定义一个整型数组
        int[] num = new int[str1.length];
        for (int i = 0; i< str1.length; i++){
            //将字符串数组变成有符号整数数组
            num[i] = Integer.parseInt(str1[i]);
        }
        //循环遍历求出所有宝箱数字和
        int sum = 0;
        for (int i = 0; i < num.length; i++){
            sum += num[i];
        }
        //System.out.println(sum);
        //循环遍历左边left+数字，右边right=sum-数字
        int left = 0;
        int right = 0;
        //定义一个变量标记
        boolean flag = false;
        for (int i = 0; i < num.length; i++){
            if (i != 0){
                //左侧做加法
                left += num[i];
            }
            //右侧做减法
            right = sum - num[i];
            if (left == right){
                //存在宝箱left==right则输出数组下标
                System.out.println(i);
                flag = true;
                break;
            }
        }

        if (!flag){
            System.out.println(-1);
        }

    }
}
