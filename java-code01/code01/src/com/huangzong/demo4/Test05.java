package com.huangzong.demo4;

public class Test05 {
    public static void main(String[] args){
        //遍历数组共求和
        //定义一个数组，存储1，2，3，4，5，
        int[] arr = new int[]{1,2,3,4,5};
        //使用for循环遍历求和
        int sum = 0;
        for (int i = 0 ; i < arr.length ; i++){
            sum+=arr[i];
        }
        //输出结果
        System.out.println(sum);
    }
}
