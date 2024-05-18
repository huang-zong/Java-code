package com.huangzong.demo16;

import java.util.ArrayList;
import java.util.StringJoiner;

public class Test01 {
    public static void main(String[] args) {
        //ArrayList
        //创建一个集合
        ArrayList<String> list = new ArrayList<>();
        //添加字符串
        list.add("asa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        //遍历
       /* System.out.print("[");
        for (int i = 0; i < list.size(); i++){
            if (i == list.size()-1){
                System.out.print(list.get(i));
            }else {
                System.out.print(list.get(i) + ",");
            }
        }*/
        StringJoiner sj = new StringJoiner(",","[","]");
        for (int i = 0; i < list.size(); i++) {
            sj.add(list.get(i));
        }
        //System.out.println("]");
        System.out.println(sj);
    }
}
