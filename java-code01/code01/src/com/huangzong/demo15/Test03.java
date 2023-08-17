package com.huangzong.demo15;

public class Test03 {
    public static void main(String[] args) {
        //定义一个方法，将int数组拼接成字符串返回
        //定义一个数组
        int[] arr = new int[]{1,2,3,4};
        //调用方法拼接
        String result = arrToString(arr);
        //输出结果
        System.out.println(result);
    }

    //定义一个方法拼接数组
    public static String arrToString(int[] arr){
        //使用StringBuilder实现拼接
        StringBuilder sb = new StringBuilder();
        sb.append("[");

        //对数组进行判断
        for (int i = 0; i < arr.length; i++){
            if (i == arr.length-1){
                sb.append(arr[i]);
            }else{
                sb.append(arr[i]).append(",");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
