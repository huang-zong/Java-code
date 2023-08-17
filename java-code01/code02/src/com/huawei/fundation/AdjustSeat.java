package com.huawei.fundation;

import java.util.ArrayList;
import java.util.Scanner;

public class AdjustSeat {
    public static void main(String[] args){
        //座位调整，输入一个整数数组，由0和1组成，0表示没有占位，座位安排如101，010
        //键盘录入数字字符串
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        //去掉","存入字符串数组
        String[] str1 = str.split(",");
        //创建集合存储
        ArrayList<Integer> list = new ArrayList<>();
        //将字符串数组存入集合
        for (int i = 0; i < str1.length; i++){
            list.add(Integer.parseInt(str1[i]));
        }
        //定义变量存储空位0的个数
        int count = 0;
        //循环遍历求空位个数
        for (int i = 0; i < list.size(); i++){
            //判断i=0的情况
            if (i == 0){
                //第一位是0时,且00、、、
                if (list.get(i) == 0 && list.get(i+1) == 0){
                    list.set(i,1);
                    count++;
                }
            }else if (i == list.size() - 1){
                //最后一位，且、、、00
                if (list.get(i) == 0 && list.get(i-1) == 0){
                    list.set(i,1);
                    count++;
                }
            }else {
                //其他条件0[0]0
                if (list.get(i) == 0 && list.get(i-1) == 0 && list.get(i+1) == 0){
                    list.set(i,1);
                    count++;
                }
            }
        }

        //输出结果
        System.out.println(count);
    }
}
