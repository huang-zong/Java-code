package com.huangzong.test;

public class PaLouTiJia {
    public static void main(String[] args) {
        //爬楼梯有时候一次爬一个台阶，有时候一次爬两个台阶，有时候一次爬三个台阶，如果有20个台阶，有多少种爬法
        //递归调用计算
        int num = 20;
        int sum = getSum(num);
        //输出结果
        System.out.println(sum);
    }

    private static int getSum(int num) {
        //递归出口
        if (num == 1){
            return 1;
        }
        if (num == 2){
            return 2;
        }
        if (num == 3){
            return 4;
        }
        return getSum(num - 1) + getSum(num - 2) + getSum(num - 3);
    }
}
