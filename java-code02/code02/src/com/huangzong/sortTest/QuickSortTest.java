package com.huangzong.sortTest;

public class QuickSortTest {
    public static void main(String[] args) {
        //快速排序
        //定义数组
        int[] arr = new int[]{6,1,2,9,3,5,10,8};
        //调用方法
        getQuickSort(arr, 0 ,arr.length-1);
        //输出结果
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    //定义方法使用快速排序
    public static void getQuickSort(int[] arr, int i ,int j){
        //结束递归的条件
        if (i > j){
            return ;
        }
        //定义变量记录要查找的范围
        int start = i;
        int end = j;
        //记录基准数
        int baseNumber = arr[i];
        //循环找到要查找的数
        while (start != end){
            //利用end，从后往前开始，找比基准数小的数字
            while (true){
                if (end <= start || arr[end] < baseNumber){
                    break;
                }
                end--;
            }
            //利用start，从前往后开始，找比基准数大的数字
            while (true){
                if (end <= start || arr[start] > baseNumber){
                    break;
                }
                start++;
            }
            //运行到这里，start指向比基准数大的数字，end指向比基准数小的数字，将两者进行交换
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
        //运行到这里start == end，将基准数与start数交换
        int temp = arr[i];
        arr[i] = arr[start];
        arr[start] =temp;

        //确定了基准数的位置，在基准数左边的数据重复
        getQuickSort(arr, i , start - 1);
        //确定了基准数的位置，在基准数左边的数据重复
        getQuickSort(arr ,start + 1, j);
    }
}
