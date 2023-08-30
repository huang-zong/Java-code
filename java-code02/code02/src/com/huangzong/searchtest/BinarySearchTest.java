package com.huangzong.searchtest;

public class BinarySearchTest {
    public static void main(String[] args) {
        //使用二分查找/折半查找，查找某个元素在数组中的索引
        //定义数组
        int[] arr = new int[]{7,23,79,81,103,127,131,147};
        //调用方法查找元素
        int index = getIndex(arr , 80 );
        //输出
        System.out.println(index);
    }

    private static int getIndex(int[] arr, int number) {
        //定义两个变量记录要查找的范围
        int low = 0;
        int high = arr.length - 1;
        //循环遍历查找数据
        while (true){
            //结束条件
            if (low > high){
                return -1;
            }
            //定义变量记录中间数据的下标
            int mid = (low + high) / 2;
            if (arr[mid] < number){
                //数据大于mid的值
                //更新low
                low = mid + 1;
            }else if (arr[mid] > number){
                //数据小于mid的值
                //更新high
                high = mid - 1;
            }else if (arr[mid] == number){
                //数据等于mid的值
                return mid;
            }
        }
    }
}
