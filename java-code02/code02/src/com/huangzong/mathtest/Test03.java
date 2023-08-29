package com.huangzong.mathtest;

public class Test03 {
    public static void main(String[] args) {
        //定义一个方法自己实现toBinaryString方法的效果，将一个十进制数转成字符串表示的二进制数
        //调用方法
        System.out.println(toBinaryString(12345));
        System.out.println(Integer.toBinaryString(12345));
    }

    public static String toBinaryString(int number){
        //定义一个StringBuilder用来拼接余数
        StringBuilder sb = new StringBuilder();
        //循环计算余数
        while (true){
            //跳出循环的条件
            if (number == 0){
                break;
            }
            int yu = number % 2;
            //将余数拼接
            sb.insert(0, yu);
            number /= 2;
        }
        return sb.toString();
    }
}
