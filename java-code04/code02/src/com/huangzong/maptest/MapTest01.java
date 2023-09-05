package com.huangzong.maptest;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

public class MapTest01 {
    public static void main(String[] args) {
        //创建集合
        Map<String , String> map = new HashMap<>();
        
        //添加元素
        map.put("zhangsan" , "lisi");
        map.put("wangwu" , "zhaolou");
        map.put("zhangliang" , "wangbai");
        
        //获取键值存入单列集合
        Set<String> keys = map.keySet();
        //遍历单列集合获取每一个键值
       /* //迭代器
        Iterator<String> it = keys.iterator();
        while (it.hasNext()){
            String key = it.next();
            //利用键获取对应的值
            String value = map.get(key);
            System.out.println(value);
        }*/
        /*//增强for
        for (String key : keys) {
            String value = map.get(key);
            System.out.println(value);
        }*/

        //lambda表达式
        keys.forEach(key ->{
                String value = map.get(key);
                System.out.println(value);
            }
        );
    }
}
