package com.huawei.fundation;

import java.util.Scanner;

public class SixteenNum {
    public static void main(String[] args){
        //键盘录入一个十六进制数
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        //创建数组存储
        String[] str1 = str.substring(2).split("");
        for (int i = 0; i < str1.length; i++){
            if (str1[i].equals("a") || str1[i].equals("A")){
                str1[i] = "10";
            }else if (str1[i].equals("b") || str1[i].equals("B")){
                str1[i] = "11";
            }else if (str1[i].equals("c") || str1[i].equals("C")){
                str1[i] = "12";
            }else if (str1[i].equals("d") || str1[i].equals("D")){
                str1[i] = "13";
            }else if (str1[i].equals("e") || str1[i].equals("E")){
                str1[i] = "14";
            }else if (str1[i].equals("f") || str1[i].equals("F")){
                str1[i] = "15";
            }
        }

        double[] num = new double[str1.length];
        for (int i = 0; i <str1.length; i++){
            num[i] = Double.parseDouble(str1[i]);

        }
        int sum = 0;
        int index = 0;
        for (int i = num.length-1; i >= 0; i--){
            sum +=(int) (num[i] * Math.pow(16, index));
            index++;
            System.out.println(sum);
        }

    }
}
