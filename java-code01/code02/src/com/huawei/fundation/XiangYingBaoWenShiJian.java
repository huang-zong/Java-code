package com.huawei.fundation;

import java.util.Scanner;

public class XiangYingBaoWenShiJian {
    public static void main(String[] args){
        //键盘录入报文数C
        Scanner sc = new Scanner(System.in);
        int C = sc.nextInt();
        //定义数组存储
        int[] T = new int[C];
        int[] M = new int[C];
        //循环录入收到报文时间T和最大相应时间M
        for (int i = 0; i < C; i++){
            T[i] = sc.nextInt();
            M[i] = sc.nextInt();
        }
        //定义数组存储结果
        int[] mrt = new int[C];
        //定义最小时间
        int min = Integer.MAX_VALUE;
        //计算最大相应时间
        for (int i = 0; i < C; i++){
            if (M[i] >= 128){
                //转换成二进制
                String str = Integer.toString(M[i] , 2);
                //低4位
                int mant = Integer.parseInt(str.substring(4) , 2);
                //高5~7位
                int exp = Integer.parseInt(str.substring(1 , 4) , 2);
                //计算M的值
                M[i] = (mant | 0x10) << (exp + 3);
            }
            mrt[i] = T[i] + M[i];
            min = Math.min(min , mrt[i]);
        }
        System.out.println(min);
    }
}
