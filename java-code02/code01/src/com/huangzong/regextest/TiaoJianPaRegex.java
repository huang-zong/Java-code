package com.huangzong.regextest;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TiaoJianPaRegex {
    public static void main(String[] args) {
        //带条件的爬虫
        //定义字符串
        String str = "java是一门面向对象的编程语言，不仅吸收了C++语言的各种优点，还摒弃了C++里难以理解的多继承、指针等概念，因此JAva8语言具有功能强大和简单易用两个特征。" +
                "Java11语言作为静态面向对象编程语言的代表，极好地实现了面向对象理论，允许程序员以优雅的思维方式进行复杂的编程 [1] 。" +
                "java具有简单性、面向对象、分布式、健壮性、安全性、平台独立与可移植性、多线程、动态性等特点 [2] 。" +
                "JAVa17可以编写桌面应用程序、Web应用程序、分布式系统和嵌入式系统应用程序等 [3] 。";

        //需求1、爬取版本号为8，11，17的Java文本，只要Java,不显示版本号
        //定义正则表达式
        String regex1 = "(?i)Java(?=8|11|17)";
        //获取正则表达式对象
        Pattern p = Pattern.compile(regex1);
        //获取文本匹配器对象
        Matcher m = p.matcher(str);
        //循环获取
        while (m.find()){
            String s = m.group();
            System.out.println(s);
        }
        System.out.println("------------------------------------");

        //需求2、爬取版本号为8，11，17的Java文本，显示版本号
        //定义正则表达式
        String regex2 = "(?i)Java(?:8|11|17)";
        //获取正则表达式对象
        Pattern p1 = Pattern.compile(regex2);
        //获取文本匹配器对象
        Matcher m1 = p1.matcher(str);
        //循环获取
        while (m1.find()){
            String s = m1.group();
            System.out.println(s);
        }
        System.out.println("------------------------------------");

        //需求3、爬取除了版本号为8，11，17的Java文本
        //定义正则表达式
        String regex3 = "(?i)Java(?!8|11|17)";
        //获取正则表达式对象
        Pattern p2 = Pattern.compile(regex3);
        //获取文本匹配器对象
        Matcher m2 = p2.matcher(str);
        //循环获取
        while (m2.find()){
            String s = m2.group();
            System.out.println(s);
        }
    }
}
