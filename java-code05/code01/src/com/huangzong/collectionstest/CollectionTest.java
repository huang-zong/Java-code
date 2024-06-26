package com.huangzong.collectionstest;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionTest {
    public static void main(String[] args) {
        //创建集合
        ArrayList<String> list = new ArrayList<>();

        //添加元素
        Collections.addAll(list , "dafdaf","dfa","fwer","123","ggasf");
        //输出
        System.out.println(list);

        //打乱元素
        Collections.shuffle(list);
        //输出
        System.out.println(list);
    }
}
