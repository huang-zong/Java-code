package com.huangzong.demo3;

public class Test02 {
    public static void main(String[] args){
        //测试case穿透
        int number = 10;
        switch(number){
            default:
                System.out.println("defalut输出");
                //break;
            case 1:
                System.out.println("1输出");
                break;
            case 10:
                System.out.println("10输出");
                //break;

        }
    }
}
