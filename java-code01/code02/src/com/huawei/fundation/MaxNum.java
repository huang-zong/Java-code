package com.huawei.fundation;

import java.util.Scanner;

public class MaxNum {
    public static void main(String[] args){
        //组成最大数，卡片上有6位内整数，排序组成最大数
        //相邻两张卡片进行排序
        //键盘录入
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        //去掉","
        String[] str1 = str.split(",");
        //循环遍历
        for (int i = 0; i < str1.length; i++){
            for (int j = i + 1; j < str1.length; j++){
                //字符串拼接转换成整数型比较
                if (Integer.parseInt(str1[i] + str1[j]) < Integer.parseInt(str1[j]+str1[i])){
                    //满足条件前加后不是最大则交换顺序
                    String temp = str1[i];
                    str1[i] = str1[j];
                    str1[j] = temp;

                }
            }
        }

        //拼接成数字字符串
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str1.length; i++) {
            sb.append(str1[i]);
        }
        sb.toString();
        System.out.println(sb);

    }
}
