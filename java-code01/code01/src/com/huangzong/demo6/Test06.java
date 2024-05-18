package com.huangzong.demo6;

public class Test06 {
    public static void main(String[] args){
        //判断101-200有多少质数，并打印出来
        //思路：for循环2~n-1是否能整除n
        //计数变量
        int count = 0;
        for (int i = 101; i <= 200; i++){
           //i表示每一个数字
            boolean flag = true;
            for (int j = 2; j < i; j++){
                if (i % j == 0){
                    flag = false;
                    break;
                }
            }
            if (flag){
                System.out.println(i + "是一个质数");
                count++;
            }

        }
        System.out.println("共有质数" + count);
    }
}
