package com.huangzong.settest;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeTest02 {
    public static void main(String[] args) {
        //TreeSet第二种排序规则
        //创建集合
        TreeSet<String> ts = new TreeSet<>((o1, o2)->{
                //o1表示当前要添加元素
                //o2表示红黑树已经存在元素
                //按长度排序
                int i = o1.length() - o2.length();
                i = i == 0 ? o1.compareTo(o2) : i;
                return i;
            }
        );

        //添加元素
        ts.add("c");
        ts.add("ab");
        ts.add("df");
        ts.add("qwer");

        //输出
        System.out.println(ts);
    }
}
