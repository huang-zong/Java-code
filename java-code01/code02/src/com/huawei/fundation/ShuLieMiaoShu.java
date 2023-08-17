package com.huawei.fundation;

import java.util.Scanner;

public class ShuLieMiaoShu {
    public static void main(String[] args){
        //键盘录入数字n
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //定义a[0]
        String num = "1";
        //判断n是否大于0
        if (n > 0 && n < 60){
            for (int i = 0; i < n; i++){
                //调用方法
                StringBuilder sb = new StringBuilder();
                num = getStr(num , sb);
                System.out.println(num);
            }
        }
    }

    //定义一个方法描述数列
    public static String getStr(String num ,StringBuilder sb){
        //获得字符串中的每一位字符
        char[] ch = num.toCharArray();
        //定义变量统计
        int count = 1;
        //循环遍历
        for (int i = 0; i < ch.length; i++) {
            if (i < ch.length-1){
                if (ch[i] == ch[i+1]) {
                    count++;
                } else {
                    sb.append(count).append(ch[i]);
                    count = 1;
                }
            }else {
                //连接字符串
                sb.append(count).append(ch[i]);
            }
        }
        return sb.toString();
    }
}
