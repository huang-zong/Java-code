package com.huangzong.demo14;

public class Test06 {
    public static void main(String[] args) {
        //手机号码屏蔽
        //获取一个手机号码
        String phoneNumber = "13112349548";
        //截取前3位号码
        String start = phoneNumber.substring(0,3);
        //截取后4位号码
        String end = phoneNumber.substring(7);
        //拼接号码
        String result = start + "****" + end;
        //输出结果
        System.out.println(result);
    }
}
