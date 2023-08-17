package com.huawei.fundation;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Shunzi {
    public static void main(String[] args){
        //斗地主找顺子
        //键盘录入13张打乱顺序的扑克牌，不包括大小王，每张扑克牌的数字都是合法的，用空格隔开
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        //去掉“ ”存入字符串数组
        String[] str1 = str.split(" ");
        ArrayList<String> list = new ArrayList<>();
        //判断是否有字符2，去掉2
        for (int i = 0; i < str1.length; i++){
            if (str1[i].equals("2")){
                continue;
            }else if (str1[i].equals("J")){
                //判断是否有J,Q,K,A，转换成数字
                str1[i] = "11";
                list.add(str1[i]);
            }else if (str1[i].equals("Q")){
                str1[i] = "12";
                list.add(str1[i]);
            }else if (str1[i].equals("K")){
                str1[i] = "13";
                list.add(str1[i]);
            }else if (str1[i].equals("A")){
                str1[i] = "14";
                list.add(str1[i]);
            }else {
                list.add(str1[i]);
            }
        }
        //创建数字存储
        int[] num = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            num[i] = Integer.parseInt(list.get(i));
        }
        Arrays.sort(num);
        //创建集合存储顺子,最多两个顺子
        ArrayList<Integer> resultList1 = new ArrayList<>();
        ArrayList<Integer> resultList2 = new ArrayList<>();
        //判断是否为连续的数字
        resultList1.add(num[0]);
        //定义一个变量记录下标
        int index = 0;
        for (int i = 1; i < num.length; i++){
            if ((num[i] == num[i-1] + 1) ){
                resultList1.add(num[i]);
                index = i;
            }else {
                break;
            }
        }
        resultList2.add(num[index+1]);
        for (int j = index+2; j < num.length; j++){
            if ((num[j] == num[j-1] + 1) ){
                resultList2.add(num[j]);
            }else {
                break;
            }
        }

        if (resultList1.size() < 5 && resultList2.size() <5){
            System.out.println("No");
        }
        if (resultList1.size() >= 5){
            for (int i = 0; i < resultList1.size(); i++){
                if (resultList1.get(i).equals(11)){
                    System.out.print("J" + " ");
                }else if (resultList1.get(i).equals(12)){
                    System.out.print("Q" + " ");
                }else if (resultList1.get(i).equals(13)){
                    System.out.print("K" + " ");
                }else if (resultList1.get(i).equals(14)){
                    System.out.print("A" + " ");
                }else {
                    System.out.print(resultList1.get(i) + " ");
                }
            }
        }
        System.out.println();
        if (resultList2.size() >=5){
            for (int i = 0; i < resultList2.size(); i++){
                if (resultList2.get(i).equals(11)){
                    System.out.print("J" + " ");
                }else if (resultList2.get(i).equals(12)){
                    System.out.print("Q" + " ");
                }else if (resultList2.get(i).equals(13)){
                    System.out.print("K" + " ");
                }else if (resultList2.get(i).equals(14)){
                    System.out.print("A" + " ");
                }else {
                    System.out.print(resultList2.get(i) + " ");
                }
            }
        }

    }
}
