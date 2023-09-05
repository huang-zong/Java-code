package com.huangzong.hashtest;

import java.util.*;

public class QiuYouTest {
    public static void main(String[] args) {
        //80个学生秋游，在A,B,C,D四个景点选择，统计想去哪个景点的人最多

        //定义数组存储景点
        String[] arr = new String[]{"A", "B", "C", "D"};
        //利用随机数模拟80个同学的投票，并把投票结果存储起来
        //定义集合存储投票结果
        ArrayList<String> list = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 80; i++){
            int index = r.nextInt(arr.length);
            list.add(arr[index]);
        }

        //定义map集合存储每个人投票结果
        HashMap<String , Integer> hs = new HashMap<>();
        //增强for遍历集合,利用hashmap中重复键值则覆盖进行统计
        for (String name : list) {
            //判断当前景点在map中是否存在
            if (hs.containsKey(name)){
                //存在，获取当前景点已经被投票的次数
                Integer value = hs.get(name);
                value++;
                hs.put(name , value);
            }else {
                //不存在
                hs.put(name , 1);
            }
        }

        //遍历比较最大值
        int max = 0;
        String name = "";

        //获取键值对对象
        Set<Map.Entry<String, Integer>> entries = hs.entrySet();
        //增强for遍历
        for (Map.Entry<String, Integer> entry : entries) {
            //获取键
            String key = entry.getKey();
            //获取值
            Integer value = entry.getValue();
            if (value > max){
                max = value;
                //更新最大值时更正投票最多的景点
                name = key;
            }
            //打印集合
            System.out.println(key + "=" + value);
        }
        //输出最多投票的景点
        System.out.println(name);
    }
}
