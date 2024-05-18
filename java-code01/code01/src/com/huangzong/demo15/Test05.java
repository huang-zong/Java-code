package com.huangzong.demo15;

import java.security.PublicKey;
import java.util.Scanner;

public class Test05 {
    public static void main(String[] args) {
        //罗马数字转换
        //键盘录入字符串
        Scanner sc = new Scanner(System.in);
        //校验字符串是否符合要求
        String str;
        while (true){
            System.out.println("请输入一个字符串");
            str = sc.next();
            boolean flag = checkStr(str);
            if (flag){
                break;
            }else {
                System.out.println("输入不符合规则，请重新输入");
                continue;
            }
        }
        //调用方法转换
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
//            int number = ch -48;
//            String strNum = changStr(number);
            String strNum = changStrW(ch);
            sb.append(strNum).toString();
        }
        //输出结果
        System.out.println(sb);
    }

    //定义一个方法校验字符串
    public  static boolean checkStr(String str){
        if (str.length() > 9){
            return false;
        }
        for (int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if (ch < '0' || ch > '9'){
                return false;
            }
        }
        return true;
    }

    //定义一个方法转换字符
    public static String changStr(int number){
        //查表法转换字符
        String[] arr = new String[]{"","Ⅰ","贰","叁","肆","伍","陆","柒","Ⅷ","Ⅸ"};
        return arr[number];
    }

    //定义一个方法使用Switch语句实现转换
    public static String changStrW(char ch){
        String str;
        switch (ch){
            case '0' -> str = "";
            case '1' -> str = "Ⅰ";
            case '2' -> str = "贰";
            case '3' -> str = "叁";
            case '4' -> str = "肆";
            case '5' -> str = "伍";
            case '6' -> str = "陆";
            case '7' -> str = "柒";
            case '8' -> str = "Ⅷ";
            case '9' -> str = "Ⅸ";
            default -> str = "";
        }
        return str;
    }
}
