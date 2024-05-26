package com.huangzong.exceptiontest;

public class ExceptionTest01 {
    public static void main(String[] args) {
        //自己处理，捕获异常
        int[] num = new int[]{1, 2, 3, 4, 5, 6};
        try{
            System.out.println(num[10]);
            System.out.println(2/0);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("算术异常");
        }
    }
}
