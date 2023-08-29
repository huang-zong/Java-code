package com.huangzong.regextest;

public class BuHuoFenZuRegex {
    public static void main(String[] args) {
        //捕获分组练习
        //去掉字符串重复的内容
        String str = "我要要学学学嘻嘻嘻";
        //替换分组
        String result = str.replaceAll("(.)\\1+", "$1");
        System.out.println(result);

    }
}
