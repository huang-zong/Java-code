package com.huangzong.functiontest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Predicate;

public class FunctionTest02 {
    public static void main(String[] args) {
        //方法引用，引用其他类的方法
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张三", "李四", "王五", "张某某");

        //过滤数据，只要张开头并且名字三个字的
        list.stream()
                .filter(s -> s.startsWith("张"))
                .filter(s -> s.length() == 3)
                .forEach(s -> System.out.println(s));
        System.out.println("---------------------");

        //匿名内部类
        list.stream()
                .filter(new Predicate<String>() {
                    @Override
                    public boolean test(String s) {
                        return s.startsWith("张") && s.length() == 3;
                    }
                }).forEach(s -> System.out.println(s));
        System.out.println("------------------------");

        //其他类中的方法引用
        list.stream()
                .filter(new StringJudge()::stringJudge)
                .forEach(s -> System.out.println(s));
        System.out.println("--------------------");

        //本类中的方法引用,静态方法中没有this,需要本类对象引用方法
        list.stream()
                .filter(new FunctionTest02()::stringJudge)
                .forEach(s -> System.out.println(s));
    }

    public boolean stringJudge(String s){
        return s.startsWith("张") && s.length() == 3;
    }
}
