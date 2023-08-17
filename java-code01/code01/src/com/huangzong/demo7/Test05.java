package com.huangzong.demo7;

import java.util.Formattable;
import java.util.Random;

public class Test05 {
    public static void main(String[] args) {
        //抽奖，数组中有5个奖金，奖项随机出现且不重复
        //定义一个数组存储奖金
        int[] arr = new int[]{2,588,888,1000,10000};
        //定义一个新的数组用来存储已经抽取的奖项
        int[] newArr = new int[arr.length];
        //随机抽奖
        Random r = new Random();
        for (int i = 0; i < arr.length;){
            int randomIndex = r.nextInt(arr.length);
            int price = arr[randomIndex];
            //判断是否已经抽取过
            boolean flag = contains(newArr, price);
            if(!flag){
                newArr[i] = price;
                //添加完毕，移动索引
                i++;
            }
        }
        //遍历数组输出抽奖结果
        for (int i = 0; i < newArr.length; i++){
            System.out.println(newArr[i]);
        }

        //输出结果
    }

    //定义一个方法判断当前抽取的奖项是否已经抽取过
    public static boolean contains(int[] arr, int price){
        for (int i = 0; i < arr.length; i++){
            if(arr[i] == price){
                return true;
            }
        }
        return false;
    }
}
