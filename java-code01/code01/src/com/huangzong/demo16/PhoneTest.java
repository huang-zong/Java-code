package com.huangzong.demo16;

import java.util.ArrayList;

public class PhoneTest {
    public static void main(String[] args) {
        //创建一个集合
        ArrayList<Phone> list = new ArrayList<>();
        //创建手机对象
        Phone p1 = new Phone("小米", 1000);
        Phone p2 = new Phone("苹果", 8000);
        Phone p3 = new Phone("锤子", 2000);
        //添加元素
        list.add(p1);
        list.add(p2);
        list.add(p3);
        //调用方法
        ArrayList<Phone> resultList = getPhoneInfo(list);
        for (int i = 0; i < resultList.size(); i++) {
            System.out.println(resultList.get(i).getBrand() + resultList.get(i).getPrice());
        }

    }

    //定义一个方法做判断
    public static  ArrayList<Phone> getPhoneInfo(ArrayList<Phone> list){
        //定义一个集合
        ArrayList<Phone> resultList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            int price = list.get(i).getPrice();
            if(price <= 3000){
                resultList.add(list.get(i));
            }
        }
        return resultList;
    }
}
