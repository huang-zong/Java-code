package com.huawei.fundation;

import java.util.Arrays;
import java.util.Scanner;

public class ShuZuZuiXiaoShuZi {
    public static void main(String[] args){
        //键盘录入数组
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        //去掉”,"存入数组
        String[] strArr = str.split(",");
        //定义整型数组
        int[] numArr = new int[strArr.length];
        for (int i = 0; i < strArr.length; i++){
            numArr[i] = Integer.parseInt(strArr[i]);
        }
        //找到三个最小值
        Arrays.sort(numArr);
        if (strArr.length >= 3){
            StringBuilder sb = new StringBuilder();
            //定义最小数字
            long min = Long.parseLong(sb.append(numArr[0]).append(numArr[1]).append(numArr[2]).toString());
            //拼接数字
            for (int i = 0; i < 3; i++){
                for (int j = 0; j < 3; j++){
                    if (i != j){
                        for (int k = 0; k < 3; k++){
                            if (k != i && k!= j){
                                StringBuilder sb1 = new StringBuilder();
                                sb1.append(numArr[i]);
                                sb1.append(numArr[j]);
                                sb1.append(numArr[k]);
                                min = Math.min(min, Long.parseLong(sb1.toString()));
                            }
                        }
                    }
                }
            }
            System.out.println(min);
        }else if (strArr.length == 2){
            StringBuilder sb1 = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            long num1 = Long.parseLong(sb1.append(numArr[0]).append(numArr[1]).toString());
            long num2 = Long.parseLong(sb2.append(numArr[1]).append(numArr[0]).toString());
            if (num1 < num2){
                System.out.println(num1);
            }else {
                System.out.println(num2);
            }
        }else if (strArr.length == 1){
            System.out.println(numArr[0]);
        }
    }
}
