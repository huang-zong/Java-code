package com.huangzong.demo15;

public class Test06 {
    public static void main(String[] args) {
        //字符串旋转比较
        //给定字符串A和B
        String strA = "abcde";
        String strB = "deabc";

        //调用方法进行比较
        boolean result = check(strA,strB);
        //输出结果
        System.out.println(result);
    }

    //定义一个方法旋转字符串
    public static String rotate(String strA){
        //StringBuilder sb = new StringBuilder();
        //使用substring截取字符串
        char first = strA.charAt(0);
        String end = strA.substring(1);
        return end + first;
       /* String first = strA.substring(0,1);
        String end = strA.substring(1);
        return sb.append(first).append(end).toString();*/
    }

    //定义一个方法旋转字符串
    public static String rotateB(String strA){
        //使用数组旋转
        char[] arr = strA.toCharArray();
        char first = arr[0];
        for (int i = 1; i <strA.length(); i ++){
            arr[i-1] = arr[i];
        }
        arr[arr.length-1] = first;
        String str = new String(arr);
        return str;
    }

    //定义一个方法进行比较
    public static boolean check(String strA, String strB){
        for (int i = 0; i < strA.length(); i++){
            //调用方法旋转字符串A
            strA = rotate(strA);
            if (strA.equals(strB)){
                return true;
            }
        }
        return false;
    }
}
