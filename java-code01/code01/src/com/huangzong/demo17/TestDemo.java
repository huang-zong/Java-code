package com.huangzong.demo17;

public class TestDemo {
    public static void main(String[] args) {
        //创建一个整数数组
        int[] arr = new int[]{10,20,50,34,100};
        //调用printArr方法
        String str = ArrayUtil.printArr(arr);
        //创建一个浮点数组
        double[] arr1 = new double[]{1.0, 4.5, 3.4, 6.6};
        //调用getAverage方法
        double num = ArrayUtil.getAverage(arr1);
        System.out.println(str);
        System.out.println(num);
    }
}
