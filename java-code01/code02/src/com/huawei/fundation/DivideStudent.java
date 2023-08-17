package com.huawei.fundation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class DivideStudent {
    public static void main(String[] args){
        //输入的格式为4/N 6/Y 5/N。。。数字为学生编号，Y表示6号知道4号是自己同班，5号知道6号不是自己同班
        //键盘录入字符串
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        //去掉" "，存储为字符串数组
        String[] str1 = str.split(" ");
        //选出同班学生，确定/Y的下标index,将index和index-1，录入同一个集合
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        //定义一个变量标记班级
        boolean flag = true;
        //定义一个变量记录异常
        boolean isError = false;
        list1.add(str1[0]);
        for (int i = 1; i <str1.length; i++){
           if (flag){
               if (str1[i].contains("/N")){
                   list2.add(str1[i]);
                   flag = false;
               }else if (str1[i].contains("/Y")){
                   list1.add(str1[i]);
               }else {
                   isError = true;
               }
           }else {
               if (str1[i].contains("/Y")){
                   list2.add(str1[i]);
               }else if (str1[i].contains("/N")){
                   list1.add(str1[i]);
                   flag = true;
               }else {
                   isError = true;
               }
           }
        }
        //定义数组存储结果
        String[] stu1 = new String[list1.size()];
        String[] stu2 = new String[list2.size()];
        for (int i = 0; i <list1.size(); i++){
            int index = list1.get(i).indexOf("/");
            stu1[i] = list1.get(i).substring(0,index);
            if (Integer.parseInt(stu1[i]) <= 0 || Integer.parseInt(stu1[i]) >= 999){
                isError = true;
            }

        }
        Arrays.sort(stu1);
        for (int i = 0; i <list2.size(); i++){
            int index = list2.get(i).indexOf("/");
            stu2[i] = list2.get(i).substring(0,index);
            if (Integer.parseInt(stu1[i]) <= 0 || Integer.parseInt(stu1[i]) >= 999){
                isError = true;
            }

        }
        Arrays.sort(stu2);
        if (stu2.length == 0){
            for (int i = 0; i < stu1.length; i++){
                System.out.print(stu1[i] + " ");
            }
            System.out.println();
        }else if (isError){
            System.out.println("ERROR");
        }else if (Integer.parseInt(stu1[0]) < Integer.parseInt(stu2[0])){
            for (int i = 0; i < stu1.length; i++){
                System.out.print(stu1[i] + " ");
            }
            System.out.println();
            for (int i = 0; i < stu2.length; i++){
                System.out.print(stu2[i] + " ");
            }
        }else {
            for (int i = 0; i < stu2.length; i++){
                System.out.print(stu2[i] + " ");
            }
            System.out.println();
            for (int i = 0; i < stu1.length; i++){
                System.out.print(stu1[i] + " ");
            }
        }

    }
}
