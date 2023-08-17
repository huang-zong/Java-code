package com.huangzong.demo14;

public class Test03 {
    public static void main(String[] args) {
        //拼接数组成字符串输出
        //定义一个数组
        int[] arr = new int[]{1,2,3,4};
        //调用方法拼接数组
        String str = arrToString(arr);
        //输出
        System.out.println(str);
    }

    //定义一个方法拼接数组
    public static String arrToString(int[] arr){
        //判断数组是否为NULL
        if (arr == null){
            return "";
        }

        //判断数组大小是否为0
        if (arr.length == 0){
            return "[]";
        }

        String result = "[";
        //循环遍历拼接
        for (int i = 0; i < arr.length; i++){
            if (i == arr.length-1){
                result = result + arr[i];
            }else {
                result = result + arr[i] + ", ";
            }

        }
        result = result + "]";
        //返回
        return result;
    }
}
