package com.huangzong.demo14;

import java.util.Scanner;

public class Test05 {
    public static void main(String[] args) {
        //金额转换
        //键盘录入金额
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入金额");
        int money = 0;
        while (true){
            money = sc.nextInt();
            //判断输入范围
            if (money >= 0 && money <=9999999){
                break;
            }else {
                System.out.println("输入金额无效，请重新输入");
            }
        }

        //获取每一位数字
        String moneyStr = "";
        while (true){
            int ge = money % 10;
            money /= 10;
            //将数字转换为大写
            String moneyToBig = moneyTOBig(ge);
            moneyStr = moneyToBig + moneyStr;
            //跳出条件
            if (money == 0){
                break;
            }
        }

        //不足七位的在前面补全零
        int count = 7 - moneyStr.length();
        for (int i = 0; i <= count; i++){
            moneyStr = "零" + moneyStr;
        }

        //插入单位
        String result = "";
        String[] arr = new String[]{"仟","佰","拾","万","仟","佰","拾","元"};
        for (int i = 0; i < moneyStr.length(); i++){
            result = result + moneyStr.charAt(i) + arr[i];
        }

        //输出结果
        System.out.println(result);
    }

    //定义一个方法转换数字
    public static String moneyTOBig(int number){
        //定义数组存储大写
        String[] arr = new String[]{"零","壹","贰","叁","肆","伍","陆","柒","捌","玖"};
        return arr[number];
    }
}
