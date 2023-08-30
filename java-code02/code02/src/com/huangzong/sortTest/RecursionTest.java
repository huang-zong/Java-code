package com.huangzong.sortTest;

public class RecursionTest {
    public static void main(String[] args) {
        //递归调用
        //计算1~100之间的和
        int sum = getSum(100);
        System.out.println(sum);
    }

    //定义方法利用递归求和
    public static int getSum(int number){
        //递归出口
        if (number == 1){
            return 1;
        }

        //递归调用
        return number + getSum(number - 1);

    }
}
