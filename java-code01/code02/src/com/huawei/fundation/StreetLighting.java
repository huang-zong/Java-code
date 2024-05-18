package com.huawei.fundation;

import java.util.ArrayList;
import java.util.Scanner;

public class StreetLighting {
    public static void main(String[] args){
        //路灯照明问题，路灯间距100米，每个路灯有自己的照明半径，求无法照明第一个和最后一个无法照明长度
        //键盘录入录入路灯数量
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        //获取缓冲池内换行符
        sc.nextLine();
        //键盘录入每个路灯照明半径
        String str = sc.nextLine();
        //去掉” “ 存入字符串数组
        String[] str1 = str.split(" ");
        //转为整型数组存储
        long[] num = new long[str1.length];
        for (int i = 0; i < num.length; i++){
            num[i] = Long.parseLong(str1[i]);
        }
        //创建集合存储相邻两个路灯无法照明长度
        ArrayList<Integer> list = new ArrayList<>();
        //创建集合存储半径超过100的路灯下标
        ArrayList<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < num.length; i++){
            //将路灯半径大于100的下标存入集合
            if (num[i] > 100){
                list1.add(i);
            }
            if (i != num.length-1){
                //第一个路灯开始往后遍历
                if ((num[i] + num[i+1]) >= 100){
                    list.add(0);
                }else {
                    int shadows = (int)(100 - num[i] -num[i+1]);
                    list.add(shadows);
                }
            }else {
                //最后一个路灯
                break;
            }
        }

        //循环计算阴影长度
        for (int i = 0; i < list1.size(); i++){
            //获取半径超过100的路灯下标
            int index = list1.get(i);
            int index1 =(int) (num[index] / 100);
            int number = (int) (num[index] % 100);
            if (index == 0){
                //第一个路灯
                int m = index + index1;
                for (int j = i; j < m; j++){
                    list.set(j,0);
                }
                if (number > num[m]){
                    int number2 = (int)(list.get(m) + num[m] - number);
                    list.set(m,number2);
                }
            }else if (index == num.length-1){
                //最后一个路灯
                int m = index - index1;
                for (int j = index-1; j > m-1; j--){
                    list.set(j,0);
                }
                if (number > num[m]){
                    int number2 = (int)(list.get(m-1) + num[m] - number);
                    list.set(m-1,number2);
                }
            }else {
                int mi = index - index1;
                int ma = index + index1;
                int min = Math.max((index - index1), 0);
                int max = Math.min((index + index1), num.length - 1);
                for (int k = index-1; k >= min; k--){
                    list.set(k,0);
                }
                if (mi-1 >= 0){
                    if (number > num[mi]){
                        int number2 = (int)(list.get(mi-1) + num[mi] - number);
                        list.set(mi-1,number2);
                    }
                }
                for (int f = index; f < max; f++){
                    list.set(f,0);
                }
                if (ma <= max){
                    int number2 = (int)(list.get(ma) + num[ma] - number);
                    list.set(ma,number2);
                }
            }
        }
        //计算总里程
        int sum = 0;
        for (int i = 0; i < list.size(); i++){
            sum += list.get(i);
        }
        if (sum >= 0){
            System.out.println(sum);
        }else {
            System.out.println(0);
        }

    }
}
