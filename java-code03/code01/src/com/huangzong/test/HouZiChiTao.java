package com.huangzong.test;

public class HouZiChiTao {
    public static void main(String[] args) {
        //猴子吃桃，第一天吃剩下的一半，并多吃一个，以后每天吃剩下一半并多吃一个，第十天还没吃发现只剩下一个桃子
        //递归调用计算最初总共有多少个
        int day = 1;
        int sum = getSum(day);
        //输出结果
        System.out.println(sum);
    }

    private static int getSum(int day) {
        if (day <= 0 || day >= 11){
            System.out.println("当前世界错误");
            return -1;
        }

        //递归出口
        if (day == 10){
            return 1;
        }

        return (getSum(day + 1) + 1) * 2;
    }
}
