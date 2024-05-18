package com.huangzong.demo5;

public class Test05 {
    public static void main(String[] args) {
        //目标：带返回值的方法的定义和调用
        //需求：计算一个公司每个季度营业额之和
        double result1 = getNum(10.1, 12.2, 14.1);
        double result2 = getNum(10.1, 12.2, 14.1);
        double result3 = getNum(10.1, 12.2, 14.1);
        double sum = result1 + result2 + result3;
        System.out.println(sum);
    }
    public static double getNum(double num1, double num2, double num3){
        double result = num1 + num2 + num3;
        return result;
    }
}
