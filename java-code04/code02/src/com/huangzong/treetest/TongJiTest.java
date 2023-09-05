package com.huangzong.treetest;

import java.util.Map;
import java.util.Set;
import java.util.StringJoiner;
import java.util.TreeMap;
import java.util.function.BiConsumer;

public class TongJiTest {
    public static void main(String[] args) {
        //统计字符串中每个字符出现的次数
        //定义字符串
        String str = "asdhfoaidhgoahgaoifhewofsdjhadjh";

        //定义集合存储
        TreeMap<Character , Integer> treeMap = new TreeMap<>();
        //遍历获取字符
        for (int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            //判断集合中是否存在字符
            if (treeMap.containsKey(ch)){
                //存在
                //获取键值
                Integer value = treeMap.get(ch);
                value++;
                treeMap.put(ch , value);
            }else {
                //不存在
                treeMap.put(ch , 1);
            }
        }
        //拼接字符串
        StringBuilder sb = new StringBuilder();
        //lambda表达式遍历
        treeMap.forEach(new BiConsumer<Character, Integer>() {
            @Override
            public void accept(Character key, Integer value) {
                sb.append(key).append("(").append(value).append(")");
            }
        });
        //输出
        System.out.println(sb);

        //StringJoiner拼接
        StringJoiner sj = new StringJoiner("" ,"" ,"");
        //增强for遍历
        Set<Map.Entry<Character, Integer>> entries = treeMap.entrySet();
        for (Map.Entry<Character, Integer> entry : entries) {
            //获取键
            Character key = entry.getKey();
            //获取值
            Integer value = entry.getValue();
            sj.add(key + "").add("(").add(value + "").add(")");
        }

        //输出
        System.out.println(sj);
    }
}
