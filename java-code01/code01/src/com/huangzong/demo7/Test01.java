package com.huangzong.demo7;

import java.util.Random;

public class Test01 {
    public static void main(String[] args) {
        //生成随机的5位验证码，前四位是大写字母或小写字母，最后以位数字
        //定义一个数组存储前四位字母
        char[] ch1 = new char[4];
        Random r = new Random();
        String result = " ";
        //随机数成字母
        for (int i = 0; i < ch1.length; i++){
            //生成一个0~25的随机数
            int num = r.nextInt(26);
            //生成一个随机数区分大小写
            int n = r.nextInt(2);
            if (n == 0){
                ch1[i] = (char)(97+num);
            }else if(n == 1){
                ch1[i] = (char)(65+num);
            }
            result = result + ch1[i];
            //System.out.print(ch1[i]);
        }
        //生成最后一位数字
        int num1 = r.nextInt(10);
        result = result + num1;
        //输出结果
        System.out.println(result);
    }
}
