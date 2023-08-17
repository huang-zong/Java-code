package com.huangzong.demo14;

public class Test04 {
    public static void main(String[] args) {
        //字符串反转
        String str = "abc";
        //调用方法反转
        String result = reverser(str);
        //输出结果
        System.out.println(result);
    }
    //定义一个方法实现字符串反转
    public static String reverser(String str){
        String result = "";
        //倒着遍历字符串
        for (int i = str.length()-1; i >= 0; i--){
            char ch = str.charAt(i);
            //拼接字符串
            result = result + ch;
        }
        //返回
        return result;
    }
}
