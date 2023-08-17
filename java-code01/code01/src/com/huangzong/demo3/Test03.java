package com.huangzong.demo3;

import java.util.Scanner;

public class Test03 {
    public static void main(String[] args){
        //测试switch新特性
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入星期");
        int weak = sc.nextInt();
        switch(weak){
            case 1,2,3,4,5 -> System.out.println("工作日");
            case 6,7 -> System.out.println("休息日");
            default -> System.out.println("没有这个星期");
        }
    }
}
