package com.huangzong.regextest;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PaChongRegex {
    public static void main(String[] args) {
        //按照要求爬取数据
        //定义字符串
        String str = "Java是一门面向对象的编程语言，不仅吸收了C++语言的各种优点，还摒弃了C++里难以理解的多继承、指针等概念，因此Java8语言具有功能强大和简单易用两个特征。" +
                "Java11语言作为静态面向对象编程语言的代表，极好地实现了面向对象理论，允许程序员以优雅的思维方式进行复杂的编程 [1] 。" +
                "Java具有简单性、面向对象、分布式、健壮性、安全性、平台独立与可移植性、多线程、动态性等特点 [2] 。" +
                "Java17可以编写桌面应用程序、Web应用程序、分布式系统和嵌入式系统应用程序等 [3] 。";

        //获取正则表达式对象
        Pattern p = Pattern.compile("Java\\d{0,2}");
        //获取文本匹配器对象
        //在str中寻找符合p规则的子串
        Matcher m = p.matcher(str);
        //循环获取
        while (m.find()){
            String s = m.group();
            System.out.println(s);
        }
    }
}
