package com.huangzong.demo7;

public class Test03 {
    public static void main(String[] args){
        //数字加密，1、每位加5；2、每位模10；3、反转
        //定义一个数字存储密码
        int[] arr = getNum();
        //每位加5
        for (int i = 0; i <arr.length; i++){
            arr[i] = arr[i] + 5;
        }
        //每位模10
        for (int i = 0; i < arr.length; i++){
            arr[i] = arr[i] % 10;
        }
        //反转
        for (int i =0 , j = arr.length-1; i < j; i++ , j--){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j]= temp;
        }
        //将数组中的元素进行拼接
        int result = 0;
        for (int i = 0; i < arr.length; i++){
            result = result * 10 + arr[i];
        }
        //输出结果
        System.out.println(result);
    }

    //定义一个方法将数字中的每一个数字提取出来
    public static int[] getNum(){
        int number = 1983;
        //定义一个变量统计number的值
        int count = 0;
        //定义一个变量存储number的值
        int temp = number;
        //循环除以10
        while(number != 0){
            number = number / 10;
            count++;
        }

        //定义一个数组存储每一个数字
        int[] arr1 = new int[count];
        //定义一个变量做下标
        int index = arr1.length-1;
        while(temp != 0){
            int ge = temp % 10;
            temp = temp / 10;
            arr1[index] = ge;
            index --;
        }
        return arr1;
    }
}
