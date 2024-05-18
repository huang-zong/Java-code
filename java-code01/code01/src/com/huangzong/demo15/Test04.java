package com.huangzong.demo15;

import java.util.StringJoiner;

public class Test04 {
    public static void main(String[] args) {
        //StringJoiner使用
        //创建对象
        StringJoiner sj = new StringJoiner("----");
        //添加数据
        sj.add("aaa").add("aaa");
        System.out.println(sj);
    }
}
