package com.huangzong.bukebianjihe;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class mapTest {
    public static void main(String[] args) {
        //不可变集合,元素上限10个
        Map<String, String> map = Map.of("zhangsan1", "1", "zhangsan2", "1", "zhangsan3", "1", "zhangsan4", "1", "zhangsan5", "1",
                "zhangsan6", "1", "zhangsan7", "1", "zhangsan8", "1", "zhangsan9", "1", "zhangsan10", "1");
        //输出打印
        //获取键
        Set<String> keys = map.keySet();
        for (String key : keys) {
            //获取值
            String value = map.get(key);
            System.out.println(key + "=" + value);
        }
        System.out.println("-----------------------");

        //当添加元素超过十个时
        //创建集合
        HashMap<String, String> hm = new HashMap<>();
        hm.put("zhangsan1", "1");
        hm.put("zhangsan2", "1");
        hm.put("zhangsan3", "1");
        hm.put("zhangsan4", "1");
        hm.put("zhangsan5", "1");
        hm.put("zhangsan6", "1");
        hm.put("zhangsan7", "1");
        hm.put("zhangsan8", "1");
        hm.put("zhangsan9", "1");
        hm.put("zhangsan10", "1");
        hm.put("zhangsan11", "1");

        //获取所有的键值对对象
        Set<Map.Entry<String, String>> entries = hm.entrySet();
        //把entries变成一个数组
        Map.Entry[] arr1 = new Map.Entry[0];
        Map.Entry[] array = entries.toArray(arr1);
        //转换成不可变集合
        Map map1 = Map.ofEntries(array);
        //打印
        for (Map.Entry<String, String> entry : entries) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "=" + value);
        }
        //添加元素
        //map1.put("lisi" , "1");

        //链式
        Map.ofEntries(hm.entrySet().toArray(new Map.Entry[0]));

        //jdk10以后
        Map<String, String> map2 = Map.copyOf(hm);
    }
}
