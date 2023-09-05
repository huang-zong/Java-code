package com.huangzong.maptest;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

public class MapTest02 {
    public static void main(String[] args) {
        //创建集合
        Map<String , String> map = new HashMap<>();

        //添加元素
        map.put("zhangsan" , "lisi");
        map.put("wangwu" , "zhaoliu");
        map.put("zhangliang" , "wangbai");

        //获取键值对对象
        Set<Map.Entry<String, String>> entries = map.entrySet();
        /*//增强for遍历
        for (Map.Entry<String, String> entry : entries) {
            //获取键值对
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "=" + value);
        }*/
        /*//迭代器遍历
        Iterator<Map.Entry<String, String>> it = entries.iterator();
        while (it.hasNext()){
            Map.Entry<String, String> next = it.next();
            System.out.println(next);
        }*/

        //lambda表达式
        entries.forEach(stringStringEntry->{
                String key = stringStringEntry.getKey();
                String value = stringStringEntry.getValue();
                System.out.println(key + "=" + value);
            }
        );
    }
}
