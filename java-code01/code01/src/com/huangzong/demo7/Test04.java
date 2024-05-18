package com.huangzong.demo7;

public class Test04 {
    public static void main(String[] args){
        //加密过程先加5，然后对10取余，最后反转的数据进行解密
        //定义一个数组记录加密之后的结果
        int[] arr = new int[]{8,3,4,6};
        //对数据进行反转
        for (int i = 0, j = arr.length - 1; i < j; i++, j--){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        //考虑到加密过程，加密后的结果在5~14之间，所以解密时0~4的加10，5~9的数字不变
        for (int i = 0; i < arr.length; i++){
            if (arr[i] >= 0 && arr[i] <= 4){
                arr[i] = arr[i] + 10;
            }
        }
        //数字减去5
        for (int i = 0; i < arr.length; i++){
            arr[i] = arr[i] - 5;
        }
        //拼接数字
        int number = 0;
        for (int i = 0; i < arr.length; i++){
            number = number * 10 + arr[i];
        }
        //输出结果
        System.out.println(number);
    }
}
