package com.huangzong.demo14;

import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {
        //键盘录入字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = sc.next();
        //进行遍历
        for (int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            System.out.println(ch);
        }
    }
}
