package com.huangzong.demo17;


public class ArrayUtil {
    //私有化构造方法,不让外界创建对象
    private ArrayUtil(){}

    //定义为静态的，方便调用
    //定义一个方法将整数数组返回字符串
    public static String printArr(int[] arr){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++){
            if (i == arr.length-1){
                sb.append(arr[i]);
            }else {
                sb.append(arr[i]).append(",");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    //定义一个方法返回平均分
    public static double getAverage(double[] arr){
        double sum = 0;
        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        return sum / arr.length;
    }
}
