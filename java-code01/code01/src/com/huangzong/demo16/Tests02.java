package com.huangzong.demo16;

import java.util.ArrayList;

public class Tests02 {
    public static void main(String[] args) {
        //ArrayList添加数字
        //创建一个集合
        ArrayList<Integer> list = new ArrayList<>();
        //添加元素
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        //遍历
        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size()-1){
                System.out.print(list.get(i));
            }else {
                System.out.print(list.get(i) + ",");
            }
        }
        System.out.print("]");
    }
}
