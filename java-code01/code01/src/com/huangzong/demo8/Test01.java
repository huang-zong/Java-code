package com.huangzong.demo8;

public class Test01 {
    public static void main(String[] args) {
        //二维数组计算每个季度总营业额和全年总营业额
        //定义一个二维数组存储每个月营业额
        int[][] yearArr= new int[][]{
                {22,66,44},
                {77,33,88},
                {25,45,65},
                {11,66,99}
        };
        //遍历二维数组，得到每一个一维数组并求和
        int yearSum = 0;
        for (int i = 0; i < yearArr.length; i++){
            //i是二维数组中的每一个索引
            int[] arr = yearArr[i];
            int sum = getSum(arr);
            System.out.println("第" + (i+1) +"季度的营业额是" + sum);
            yearSum += sum;
        }
        //输出结果
        System.out.println("全年的营业额是" + yearSum);
    }

    //定义一个方法，计算每一个季度的营业额
    public static int getSum(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        return sum;
    }
}
