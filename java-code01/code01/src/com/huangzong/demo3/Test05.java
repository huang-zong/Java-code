package com.huangzong.demo3;

public class Test05 {
    public static void main(String[] args){
        //求1-100之间偶数和
        //for循环内部进行if条件判断模2
        int result = 0;
        for(int i = 1 ; i <= 100 ;i++){
            if(i % 2 ==0){
                result+=i;
            }
        }

        //输出结果
        System.out.println(result);
    }
}
