package com.huangzong.sortTest;

public class SelectionSortTest {
    public static void main(String[] args) {
        //选择排序
        //定义数组
        int[] arr = new int[]{3,4,1,5,2};
        //使用选择排序进行排序
        //外循环是执行多少轮选择
        for (int i = 0; i < arr.length - 1; i++){
            //内循环进行比较，交换
            for (int j = i + 1; j < arr.length; j++){
                if (arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        //输出结果
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
