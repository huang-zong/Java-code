package com.huangzong.demo5;

public class Test04 {
    public  static void main(String[] args){
        //目标：掌握带参数方法定义的格式和调用的格式
        getNum(10,2);
    }
    public static void getNum(int num1, int num2){
        int result = num1 + num2;
        System.out.println(result);
    }
}
