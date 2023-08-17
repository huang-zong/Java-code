package com.huawei.fundation;

import java.util.ArrayList;
import java.util.Scanner;

public class ZiFuChuanZhaiYao {
    public static void main(String[] args){
        //键盘录入字符串
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        //去掉非字母的字符
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if (Character.isLetter(ch)){
                sb.append(ch);
            }
        }
        //定义遍历统计字母
        StringBuilder sbR = new StringBuilder();
        //遍历统计
        for (int i = 0; i < sb.length()-1; i++){
            int count = 0;
            char ch1 = sb.charAt(i);
            char ch2 = sb.charAt(i+1);
            //转换为小写字母
            if (ch1 < 97){
                ch1 += 32;
            }
            if (ch2 < 97){
                ch2 += 32;
            }
            sbR.append(ch1);
            if (ch1 == ch2 ){
                count = 1;
                for (int j = i+1; j < sb.length(); j++){
                    //判断是否连续
                    char ch3 = sb.charAt(j);
                    //转换为小写字母
                    if (ch3 < 97){
                        ch3 += 32;
                    }
                    if (ch1 == ch3 ){
                        count++;
                        i++;
                    }
                }
                sbR.append(count);
            } else {
                for (int j = i+1; j < sb.length(); j++){
                    //判断是否连续
                    char ch3 = sb.charAt(j);
                    //转换为小写字母
                    if (ch3 < 97){
                        ch3 += 32;
                    }
                    if (ch1 == ch3){
                        count++;
                    }
                }
                sbR.append(count);
            }
        }
        //数字排序
        for (int i = 0; i < sbR.length()-1; ){
            for (int j = i + 2; j < sbR.length()-1; ){
                //获得数字
                char num = sbR.charAt(i + 1);
                char num1 = sbR.charAt(j + 1);
                if (num < num1){
                    //数字降序排序
                    String strR1 = sbR.substring(i , i + 2);
                    String strR2 = sbR.substring(j , j + 2);
                    sbR.replace(i , i + 2 , strR2);
                    sbR.replace(j , j + 2 , strR1);
                }
                j += 2;
            }
            i += 2;
        }
        //数字相同的按字母升序排序
        for (int i = 0; i < sbR.length()-2; ){
            for (int j = i + 2; j < sbR.length()-2; ){
                char ch1 = sbR.charAt(i);
                char ch2 = sbR.charAt(j);
                if (ch1 > ch2){
                    String strR1 = sbR.substring(i , i + 2);
                    String strR2 = sbR.substring(j , j + 2);
                    sbR.replace(i , i + 2 , strR2);
                    sbR.replace(j , j + 2 , strR1);
                }
                j += 2;
            }
            i += 2;
        }
        //输出结果
        for (int i = 0; i < sbR.length(); i++){
            System.out.print(sbR.charAt(i));
        }
    }
}
