package com.huangzong.demo6;

public class Test03 {
    public static void main(String[] args) {
        //设计一个方法确定数组中是否存在一个数
        //定义一个数组
        int[] arr2 = new int[]{2,65,24,57,37};
        //调用方法查询数字
        boolean flag = findNum(arr2, 57);
        //输出结果
        System.out.println(flag);
    }

    //定义一个方法查询数组
    public static boolean findNum(int[] arr2 , int number){
        for (int i = 0; i <arr2.length; i++){
            if (arr2[i] == number){
                return true;
            }
        }
        //数组遍历结束未找到
        return false;
    }
}
