package com.huangzong.demo5;

public class Test01 {
    public static void main(String[] args){
        //变化数据，遍历数组，将数组中的奇数扩大两倍，偶数变成二分之一
        //定义一个数组，存储1，2，3，4，5，6，7，8，9，10
        int[] arr2 = new int[]{1,2,3,4,5,6,7,8,9,10};
        //for循环遍历数组
        //if条件判断奇偶
        for (int i = 0; i < arr2.length; i++){
            if (arr2[i] % 2 == 0){
                arr2[i]/=2;
            }else{
                arr2[i]*=2;
            }
        }
        //输出结果
        for(int i = 0; i < arr2.length; i++){
            System.out.println(arr2[i]);
        }
    }
}
