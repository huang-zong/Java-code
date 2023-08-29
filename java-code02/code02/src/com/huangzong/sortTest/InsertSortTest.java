package com.huangzong.sortTest;

public class InsertSortTest {
    public static void main(String[] args) {
        //插入排序
        //定义数组
        int[] arr = new int[]{3,44,16,24,27,50,9,20,34};
        //找到无序的数组从哪个索引开始
        int startIndex = -1;
        for (int i = 0; i < arr.length - 1; i++){
            if (arr[i] > arr[i+1]){
                startIndex = i;
                break;
            }
        }

        //遍历从startIndex开始到最后一个数据
        for (int i = startIndex; i < arr.length; i++){
            //记录当前要插入数据的索引
            int index = i;
            while (index > 0 && arr[index] < arr[index - 1]){
                int temp = arr[index];
                arr[index] = arr[index - 1];
                arr[index - 1] = temp;
                index--;
            }
        }

        //输出结果
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
