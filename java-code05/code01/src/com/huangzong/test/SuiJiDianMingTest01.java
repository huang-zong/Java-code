package com.huangzong.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class SuiJiDianMingTest01 {
    public static void main(String[] args) {
        //创建集合
        ArrayList<String> list = new ArrayList<>();
        //添加元素
        Collections.addAll(list , "zhnagsan" , "lisi" , "wangwu" , "zhaoliu" , "hanqi");
        //生成随机索引
        Random r = new Random();
        int index  = r.nextInt(list.size());
        //获取元素
        String str = list.get(index);
        System.out.println(str);

        //方法二：通过打乱元素顺序，获取
        Collections.shuffle(list);
        String str1 = list.get(0);
        System.out.println(str1);
    }
}
