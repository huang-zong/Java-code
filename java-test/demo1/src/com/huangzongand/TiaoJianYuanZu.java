package com.huangzongand;

import java.util.Scanner;

public class TiaoJianYuanZu {
    public static void main(String[] args) {
        //键盘录入nums数组
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        //去掉" " ,存入数组
        String[] strArr = str.split(" ");
        //存入整型数组
        int[] strNum = new int[strArr.length];
        for (int i = 0; i < strArr.length; i++){
            strNum[i] = Integer.parseInt(strArr[i]);
        }
        //键盘录入整数k
        int k = sc.nextInt();
        //键盘录入target
        int target = sc.nextInt();
        //定义数组存储k个数据
        int[] result = new int[k];
        //定义一个结果变量
        int sum = target;
        //定义变量统计
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        //循环遍历
        for (int i = 0; i < strNum.length; i++){
            for (int j = 0; j < strNum.length; j++){
                if (sum - strNum[j] > 0){
                    sum -= strNum[j];
                }else if (sum - strNum[j] == 0){
                    count1++;
                }
            }
        }
        //循环遍历
        for (int i = strNum.length/2; i >= 0; i--){
            for (int j = strNum.length/2; j >= 0; j--){
                if (sum - strNum[j] > 0){
                    sum -= strNum[j];
                }else if (sum - strNum[j] == 0){
                    count2++;
                }
            }
        }
        //循环遍历
        for (int i = strNum.length/2; i < strNum.length; i++){
            for (int j = strNum.length/2; j < strNum.length; j++){
                if (sum - strNum[j] > 0){
                    sum -= strNum[j];
                }else if (sum - strNum[j] == 0){
                    count3++;
                }
            }
        }
        int max = Math.max(count1,count2);
        max = Math.max(max , count3);
        System.out.println(max);
    }
}
