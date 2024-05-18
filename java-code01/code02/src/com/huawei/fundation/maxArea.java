package com.huawei.fundation;

import java.util.Scanner;

public class maxArea {
    public static void main(String[] args){
        //计算使得太阳能板的面积最大，正方形太阳能板的面积是长x宽，本题中长是两根支柱的距离，宽是两根支柱短的那根
        //当距离a <= min(支柱A,支柱B），面积S = a*a;
        //求出所有满足条件的面积，求最大值

        final int NUM = 1000;

        //键盘录入数组
        Scanner sc = new Scanner(System.in);

        //键盘录入字符串
        String str = sc.nextLine();

        //去掉录入的","
        String[] str1 = str.split(",");

        int[] str2 = new int[str1.length];
        for (int i = 0; i < str1.length; i++) {

            //Integer.parseInt将数字字符串解析为带符号十进制整数
            str2[i] = Integer.parseInt(str1[i]);
            //System.out.println(str2[i]);
        }
        //创建另一个数组存储所有满足条件的面积
        int[] areaArr = new int[NUM];
        //定义变量记录面积数组的下标
        int index = 0;

        //从第一根支柱向后遍历求出所有满足条件的面积
        for (int i = 0; i < str2.length; i++){
            //定义一个变量记录两根支柱之间的距离
            int count = 1;
            //从第二根支柱向后比较
            for (int j = 1; j < str2.length; j++){
                int min = Math.min(str2[i],str2[j]);
                if (count <= min){
                    areaArr[index] = count * count;
                    index++;
                }
                count++;
            }
        }
        //求最大面积

        int max = areaArr[0];
        for (int i = 0; i < areaArr.length; i++){
            if (areaArr[i] == 0){
                break;
            }
            max = Math.max(max,areaArr[i]);
        }

        System.out.println(max);
    }
}
