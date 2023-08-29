package com.huangzong.sortTest;

public class BubbleSortTest {
    public static void main(String[] args) {
        //冒泡排序
        //定义数组
        int[] arr = new int[]{2,4,5,3,1};
        //利用冒泡排序进行排序
        //外循环为执行多少轮冒泡
        for (int i = 0; i < arr.length - 1; i++){
            //内循环依次比较，交换
            for (int j = 0; j  < arr.length - 1 - i; j++){ // -i是因为最大的数据已经放到最后位置所以不需要比较
                if (arr[j] > arr[j + 1]){
                    //前一个数据更大时交换
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        //输出结果
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
