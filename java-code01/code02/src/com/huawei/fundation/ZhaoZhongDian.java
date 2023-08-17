package com.huawei.fundation;

import java.util.Scanner;

public class ZhaoZhongDian {
    public static void main(String[] args){
        //键盘录入数组
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        //去掉“ "存入数组
        String[] strN = str.split(" ");
        //获得数组长度
        int len = strN.length;
        //转换成整型数组
        int[] num = new int[len];
        for (int i = 0; i < len; i++){
            num[i] = Integer.parseInt(strN[i]);
        }
        //定义遍历统计步数
        int count = 0;
        //定义变量标记
        boolean flag = true;
        //定义最小步数
        int min = Integer.MAX_VALUE;
        //第一步 <= 1 < len / 2
        for (int i = 1; i < len / 2; i++){
            //定义数组下标
            int index = i;
            count = 1;
            while (index < len -1){
                //步数加1
                count++;
                index += num[index];
            }
            if (index == len-1){
                min = Math.min(min , count);
                flag = true;
            }else {
                flag = false;
            }
        }
        if (flag){
            System.out.println(min);
        }else {
            System.out.println("-1");
        }

    }
}
