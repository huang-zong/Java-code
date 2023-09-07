package com.huangzong.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class SuiJiDianMingTest02 {
    public static void main(String[] args) {
        //随机点名，70%点到男生，30%点到女生
        //创建集合
        ArrayList<String> boyList = new ArrayList<>();
        ArrayList<String> girlList = new ArrayList<>();

        //添加元素
        Collections.addAll(boyList , "zhangsan" , "wangwu" , "hanliu" , "zhuqi");
        Collections.addAll(girlList , "lisi" , "baiqiqi" , "lujiu");

        //生成随机数决定概率
        Random r = new Random();
        int num = r.nextInt(10);
        if (num < 7){
            //生成随机索引
            int index = r.nextInt(boyList.size());
            //获取元素
            String name = boyList.get(index);
            System.out.println(num);
            System.out.println(name);
        }else {
            //生成随机索引
            int index = r.nextInt(girlList.size());
            //获取元素
            String name = girlList.get(index);
            System.out.println(num);
            System.out.println(name);
        }

    }
}
