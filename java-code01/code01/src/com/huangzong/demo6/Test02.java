package com.huangzong.demo6;

public class Test02 {
    public static void main(String[] args){
        //设计一个方法求数组最大值
        //定义一个数组
        int[] arr1 = new int[]{2,15,26,7,24};
        //调用方法求最大值
        int max = getMax(arr1);
        //打印结果
        System.out.println(max);
    }

    //定义一个方法求数组最大值
    public static int getMax(int[] arr1){
        int max = arr1[0];
        for (int i = 1; i < arr1.length; i++){
            if (arr1[i] > max){
                max = arr1[i];
            }
        }
        return max;
    }
}
