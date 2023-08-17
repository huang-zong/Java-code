package com.huawei.fundation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SheJiBiSaiChengJi {
    public static void main(String[] args){
        //键盘录入射击次数N
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        //键盘录入N次射击的选手ID
        String ID = sc.nextLine();
        String[] ID1 = ID.split(",");
        //键盘录入每次射击的成绩
        String cheng = sc.nextLine();
        String[] cheng1 = cheng.split(",");
        //定义整型数组存储
        int[] num = new int[cheng1.length];
        //转换为整型
        for (int i = 0; i < cheng1.length; i++) {
            num[i] = Integer.parseInt(cheng1[i]);
        }
        //定义集合存储ID
        ArrayList<String> list = new ArrayList<>();
        list.add(ID1[0]);
        //选手ID存入集合
        for (int i = 1; i < ID1.length; i++){
            if (!list.contains(ID1[i])){
                list.add(ID1[i]);
            }
        }
        //定义数组存储成绩和
        int[][] result = new int[list.size()][2];
        //计算选手最高三个成绩和
        for (int i = 0; i < list.size(); i++){
            //定义集合存储同ID成绩
            ArrayList<Integer> list1 = new ArrayList<>();
            int sum = 0;
            for (int j = 0; j < ID1.length; j++){
                if (ID1[j].equals(list.get(i))){
                    list1.add(num[j]);
                }
            }
            //排序
            Collections.sort(list1);
            if (list1.size() < 3){
                result[i][1] = 0;
            }else {
                for (int k = list1.size()-1; k > list1.size() - 4; k--){
                    sum +=list1.get(k);
                }
                result[i][0] = Integer.parseInt(list.get(i));
                result[i][1] = sum;
            }
        }
        //成绩排序降序
        for (int i = 0; i < result.length; i++){
            for (int j = 0; j < result.length; j++){
                if (result[i][1] > result[j][1]){
                    int temp = result[i][0];
                    int temp1 = result[i][1];
                    result[i][0] = result[j][0];
                    result[i][1] = result[j][1];
                    result[j][0] = temp;
                    result[j][1] = temp1;
                }else if (result[i][1] == result[j][1]){
                    //成绩相同的按ID降序排序
                    if (result[i][0] > result[j][0]){
                        int temp = result[i][0];
                        int temp1 = result[i][1];
                        result[i][0] = result[j][0];
                        result[i][1] = result[j][1];
                        result[j][0] = temp;
                        result[j][1] = temp1;
                    }
                }
            }
        }
        //输出ID
        for (int i = 0; i < result.length; i++){
            if (i != result.length-1){
                System.out.print(result[i][0] + "," + result[i][1] + ";");
            }else {
                System.out.print(result[i][0] + "," + result[i][1]);
            }

        }
    }
}
