package com.huawei.fundation;

import java.util.*;

public class MingRandom {
    public static void main(String[] args){
        //键盘录入
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        //创建字符串数组
        String[] str = new String[N];
        int index = 0;
        for (int i = 0; i < N; i++){
            str[index] = sc.nextLine();
            index++;
        }
        //创建整型数组
        int[] num = new int[N];
        for (int i = 0; i < N; i++){
            num[i] = Integer.parseInt(str[i]);
        }
        //创建集合
        ArrayList<Integer> list = new ArrayList<>();
        //循环去掉重复的数字
        for (int i = 0; i < N; i++){
            if (!list.contains(num[i])){
                list.add(num[i]);
            }
        }
        //排序
        Collections.sort(list);
        //输出
        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
