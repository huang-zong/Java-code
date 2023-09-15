package com.huangzong.streamtest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ZiDingYiDuiXiangGuoLv {
    public static void main(String[] args) {
        //创建集合存储男演员
        ArrayList<String> boyList = new ArrayList<>();
        Collections.addAll(boyList, "张三,23", "王武器,25", "照亮吧,21", "活命啊,26");
        //创建集合存储女演员
        ArrayList<String> girlList = new ArrayList<>();
        Collections.addAll(girlList, "里斯,24", "杨起,23", "小七那,25", "杨子鳄,23");

        //男演员只要名字三个字的前两人
        Stream<String> stream1 = boyList.stream()
                .filter(name -> name.split(",")[0].length() == 3)
                .limit(2);
        //女演员只要姓杨的，并且不要第一个
        Stream<String> stream2 = girlList.stream()
                .filter(name -> name.split(",")[0].startsWith("杨"))
                .skip(1);

        //将两个流合并,封装成Actor对象
        List<Actor> list = Stream.concat(stream1, stream2)
                .map(s -> new Actor(s.split(",")[0], Integer.parseInt(s.split(",")[1])))
                .collect(Collectors.toList());
        System.out.println(list);

    }
}
