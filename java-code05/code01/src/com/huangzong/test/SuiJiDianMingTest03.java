package com.huangzong.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class SuiJiDianMingTest03 {
    public static void main(String[] args) {
        //被点到的名字不会再被点到，所有名字点完开启第二轮点名

        //创建集合
        ArrayList<String> list = new ArrayList<>();
        //添加元素
        Collections.addAll(list , "zhnagsan" , "lisi" , "wangwu" , "zhaoliu" , "hanqi");
        //创建集合存储已经被点名的名字
        ArrayList<Integer> newList = new ArrayList<>();
        //随机点名
        Random r = new Random();
        for (int i = 1; i <= 10; i++){
            System.out.println("================第" + i + "轮点名================");
            //定义临时变量
            int count = 0;
            while (true){
                int index = r.nextInt(list.size());
                if (!newList.contains(index)){
                    String name = list.get(index);
                    //将索引加入集合
                    newList.add(index);
                    System.out.println(name);
                    count++;
                }
                //跳出循环条件
                if (count == list.size()){
                    break;
                }
            }
            //清空newList集合
            newList.clear();
        }
    }
}
