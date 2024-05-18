package com.huawei.fundation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DivideCandy {
    public static void main(String[] args){
        //分糖果，如果只拿了一颗则输出结果，每次拿一半糖果分给其他人，不能均分时则放回一个糖果或者再拿一个糖果
        // 取出、放回、平均分配均要记一次，直到最后只剩下一个糖果，最后一次分配一定是2个


        //键盘录入糖果数量
        Scanner sc = new Scanner(System.in);
        long numCandy = sc.nextLong();

        //创建集合存储可能的分配次数
        ArrayList<Integer> list = new ArrayList<>();
        //定义一个变量存储分糖果次数
        int num = 0;
        //调用方法分配糖果
        ArrayList<Integer> list1 = divideCandy(numCandy, num ,list);

        //定义一个变量存储分糖果最少次数
        int min = list1.get(0);
        Collections.sort(list1);
        for (int i = 0; i < list.size(); i++) {
            min = Math.min(list1.get(i),list1.get(0));
        }
        System.out.println(min);
    }

    //定义一个方法分配糖果
    public static ArrayList<Integer> divideCandy (long numCandy, int num, ArrayList<Integer> list){
        //当一次抓取到一个糖果时
        if (numCandy == 1){
            //分糖果结束将次数存入集合
            list.add(num);
            return list;
        }else if (numCandy % 2 == 0){
            num++;
            divideCandy(numCandy/2, num, list);
        }else if (numCandy % 2 == 1){
            num++;
            divideCandy(numCandy+1, num, list);
            divideCandy(numCandy-1, num, list);
        }
        return list;
    }
}

