package com.huangzong.mathtest;

import java.util.ArrayList;
import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        //键盘录入一些1~100之间的整数，并添加到集合。直到集合中所有数据和超过200为止。
        //创建集合存储整数
        ArrayList<Integer> list = new ArrayList<>();
        //键盘录入并添加到集合
        Scanner sc = new Scanner(System.in);
        //循环录入
        while (true){
            System.out.println("请输入一个整数");
            String numStr = sc.nextLine();
            //转换为整数
            int num = Integer.parseInt(numStr);
            //对异常数据过滤
            if (num < 1 || num > 100 ){
                System.out.println("当前输入不在1~100之间，请重新录入");
                continue;
            }
            //将数据加入集合
            list.add(num);
            //对list集合的数据和判断
            int sum = getSum(list);
            if (sum > 200){
                System.out.println("集合数据已经满足要求");
                break;
            }
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i) + " ");
        }
    }

    private static int getSum(ArrayList<Integer> list) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        return sum;
    }
}

