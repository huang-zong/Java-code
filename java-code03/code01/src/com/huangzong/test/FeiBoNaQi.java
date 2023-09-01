package com.huangzong.test;

public class FeiBoNaQi {
    public static void main(String[] args) {
        //使用递归计算斐波那契数列
        int month = 12;
        int sum = getSum(month);
        //输出
        System.out.println(sum);
    }

    private static int getSum(int month) {
        //递归出口
        if (month == 1 || month ==2){
            return 1;
        }
        return getSum(month - 1) + getSum(month - 2);
    }
}
