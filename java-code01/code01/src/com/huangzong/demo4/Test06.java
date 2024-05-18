package com.huangzong.demo4;

public class Test06 {
    public static void main(String[] args){
        //统计个数，数组里面有多少个可以被3整除
        //定义一个数据，添加数据1，2，3，4，5，6，7，8，9，10
        int[] arr1 = new int[]{1,2,3,4,5,6,7,8,9,10};
        int count = 0;
        //for循环遍历，if条件判断
        for (int i = 0 ; i < arr1.length ; i++){
            if(arr1[i] % 3 == 0){
                count++;
            }
        }
        //输出结果
        System.out.println(count);
    }
}
