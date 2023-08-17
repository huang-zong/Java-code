package com.huangzong.demo6;

public class Test01 {
    public static void main(String[] args){
        //设计一个方法用于数组遍历，结果打印在一行上
        //定义一个数组
        int[] arr = new int[]{11,22,33,44,55};

        //调用方法遍历数组
        printArr(arr);
    }

    //定义一个方法遍历数组，不需要返回值
    public static void printArr(int[] arr){
        for (int i =0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
