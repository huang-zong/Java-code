package com.huangzong.listtest;

import java.util.ArrayList;

public class ListUtilTest {
    public static void main(String[] args) {
        //创建对象
        ArrayList<String> list = new ArrayList<>();
        ListUtil.addAll(list , "aaa" ,"bbb", "ccc");

        System.out.println(list);
    }
}
