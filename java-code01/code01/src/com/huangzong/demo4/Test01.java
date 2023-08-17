package com.huangzong.demo4;

public class Test01 {
    public static void main(String[] args){
        //逢7必问题
        //在1-100之间，包含7或者7的倍数都要说：过
        //使用for循环实现，用if条件判断

        for(int i = 1; i <= 100 ; i++){
            if(i % 7 == 0 || i % 10 == 7 || i /10 == 7) {
                System.out.println("过");
                continue;
            }
            System.out.println(i);
        }
    }
}
