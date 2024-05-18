package com.huawei.fundation;

import java.util.ArrayList;
import java.util.Scanner;

public class EmptyBottle {
    public static void main(String[] args){
        //键盘录入数据，数字0表示输入结束
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        //创建整数数组存储数据
        int[] num = new int[10];
        int index = 0;
        //创建数组存储
        String[] str = new String[10];
        while(flag){
             str[index] = sc.nextLine();
             if (str[index].equals("0")){
                flag = false;
             }
             index++;
        }
        //转换为有符号数组
        for (int i = 0; i < index; i++){
            num[i] = Integer.parseInt(str[i]);
        }
        //调用方法循环遍历
        for (int i = 0; i < index-1; i++){
            //每次循环创建集合
            ArrayList<Integer> list = new ArrayList<>();
            int sum = 0;
            BottleSum(num[i],list);
            for (int j = 0; j < list.size(); j++){
                sum = sum + list.get(j);
                //System.out.println(list.get(i));
            }
            System.out.println(sum);
        }

    }

    public static boolean BottleSum(int temp, ArrayList<Integer> list){
        if (temp <= 1){
            return list.add(0);
        }else if (temp == 2){
            return list.add(1);
        }else {
            list.add(temp / 3);
            temp = temp / 3 + temp % 3;
            BottleSum(temp,list);
        }
        return true;
    }
}
