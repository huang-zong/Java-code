package com.huangzong.bukebianjihe;

import java.util.Set;

public class setTest {
    public static void main(String[] args) {
        //不可变集合，元素不能重复
        Set<String> set = Set.of("zhangsan", "lisi", "wangwu", "zhaoliu");
        //打印
        System.out.println(set);
        //添加
        //set.add("hanqi");
    }
}
