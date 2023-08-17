package com.huangzong.demo6;

public class Test04 {
    public static void main(String[] args) {
        //设计一个方法用于复制数组中的元素到新数组并返回
        //定义一个初数组
        int[] arr3 = new int[]{1,2,3,4,5,6,7,8,9};
        //调用方法
        int[] arr5 = getArr(arr3,3,7);
        //打印结果
        for (int i = 0; i < arr5.length; i++){
            System.out.println(arr5[i]);
        }

    }

    //定义方法截取数组元素
    public static int[] getArr(int[] arr3, int from, int to){
        int[] arr4 = new int[to-from];
        //伪造索引
        int index = 0;
        for (int i = from; i < to; i++){
            arr4[index] = arr3[i];
            index++;
        }
        return arr4;
    }
}
