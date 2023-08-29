package com.huangzong.searchtest;

import java.util.ArrayList;

public class BasicSearchTest {
    public static void main(String[] args) {
        //使用基本查找，查找某个元素在数组中的索引
        //定义数组
        int[] arr = new int[]{134,22,16,17,45,12,19,43,21};
        //调用方法查找
        int index = getIndex(arr , 45);
        System.out.println(index);

        //考虑有数据重复的情况
        //定义数组
        int[] arr1 = new int[]{134,22,16,17,45,12,19,43,21,17};

        //调用方法查找
        ArrayList<Integer> resultList = getIndexList(arr1 , 17);
        for (int i = 0; i < resultList.size(); i++){
            System.out.print(resultList.get(i) + " ");
        }
    }

    private static ArrayList<Integer> getIndexList(int[] arr1, int number) {
        //定义集合存储结果
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr1.length; i++){
            if (arr1[i] == number){
                list.add(i);
            }
        }
        return list;
    }

    private static int getIndex(int[] arr, int number) {
        //循环遍历
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == number){
                return i;
            }
        }
        return -1;
    }
}
