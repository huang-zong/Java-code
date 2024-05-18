package com.huawei.fundation;

import java.util.Arrays;
import java.util.Scanner;

public class IPv4Address {
    public static void main(String[] args){
        //将IPv4转换为32位整数
        //输入格式位128#255#255#255
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        //去掉“#”，存入字符串数组
        String[] str1 = str.split("#");
        //定义一个变量标记
        boolean flag = true;
        //创建一个整型数组
        long[] num = new long[str1.length];
        //判断第一小节1~128，后三节0~255
        for (int i = 0; i < str1.length; i++){
            num[i] = Integer.parseInt(str1[i]);
            if (i == 0 && (num[i] >=1 && num[i] <=128)){
                flag = true;
            }else if (i !=0 && (num[i] >=0 && num[i] <=255)){
                flag = true;
            }else {
                flag = false;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < num.length; i++){
            if (num[i] <= 16){
                sb.append(0).append(Long.toString(num[i], 16));
            }else {
                sb.append(Long.toString(num[i], 16));
            }
        }
        Long longNum = Long.parseLong(sb.toString(),16);
        if (flag){
            System.out.println(longNum);
        }else {
            System.out.println("invalid IP");
        }

    }
}
