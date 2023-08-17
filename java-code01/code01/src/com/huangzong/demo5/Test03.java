package com.huangzong.demo5;

import java.util.Random;

public class Test03 {
    public static void main(String[] args){
        //打乱数组，存入1-5，打乱顺序
        //定义一个数组，存储1-5
        int[] arr4 = new int[]{1,2,3,4,5};
        //遍历数组，从0开始打乱数组
        //随机数生产随机索引
        Random r = new Random();
        for (int i = 0; i < arr4.length; i++){
            int num = r.nextInt(arr4.length);
            int temp = arr4[i];
            arr4[i] = arr4[num];
            arr4[num] = temp;
        }
        //输出结果
        for (int i = 0; i < arr4.length; i++){
            System.out.print(arr4[i] + "\t");
        }
    }
}
