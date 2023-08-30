package com.huangzong.sortTest;

public class FactorialRecursionTest {
    public static void main(String[] args) {
        //递归求阶乘
        int sum = getFactorialRecursion(5);
        System.out.println(sum);
    }

    //定义方法递归求阶乘
    public static int getFactorialRecursion(int number){
        //递归出口
        if (number == 1){
            return 1;
        }

        //递归调用
        return number * getFactorialRecursion(number - 1);
    }
}
