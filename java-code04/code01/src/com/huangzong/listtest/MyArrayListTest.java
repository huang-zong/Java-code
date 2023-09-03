package com.huangzong.listtest;

public class MyArrayListTest {
    public static void main(String[] args) {
        //创建对象
        MyArrayList<String> list = new MyArrayList<>();

        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");

        String str = list.get(1);
        System.out.println(str);

        System.out.println(list);
    }
}
