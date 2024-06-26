package com.huangzong.test;

import java.util.*;

public class JiHeQianTaoTest {
    public static void main(String[] args) {
        //使用集合嵌套

        //创建map集合
        HashMap<String , ArrayList<String>> hm = new HashMap<>();

        //创建单列集合
        ArrayList<String> city1 = new ArrayList<>();
        ArrayList<String> city2 = new ArrayList<>();
        ArrayList<String> city3 = new ArrayList<>();
        //添加元素
        Collections.addAll(city1 , "南京市","扬州市","苏州市","无锡市","常州市");
        Collections.addAll(city2 , "武汉市","孝感市","十堰市","宜昌市","鄂州市");
        Collections.addAll(city3 , "石家庄市","唐山市","邢台市","保定市","张家口市");

        //加入map集合
        hm.put("江苏省" , city1);
        hm.put("湖北省" , city2);
        hm.put("河北省" , city3);

        //输出打印
        //获取键值对对象
        Set<Map.Entry<String, ArrayList<String>>> entries = hm.entrySet();
        //增强for遍历
        for (Map.Entry<String, ArrayList<String>> entry : entries) {
            //获取键
            String key = entry.getKey();
            //获取值
            ArrayList<String> value = entry.getValue();
            //遍历单列集合
            StringJoiner sj = new StringJoiner(", " , "" , "");
            for (String city : value) {
                sj.add(city);
            }

            System.out.println(key + " = " + sj);
        }
    }
}
