package com.huangzong.demo7;

import java.util.Scanner;

public class Test02 {
    public static void main(String[] args){
        //6名评委打分，分数范围1~100之间的整数，最后得分去掉最高分和最低分求4位评委平均分
        //定义一个数组存储6位评委打分
        int [] score = getScores();
        //求出数组最大值
        int max = getMax(score);
        //求出数组最小值
        int min = getMin(score);
        //求出数组和
        int sum = getSum(score);
        //数组和减去最大、最小求平均
        int result = (sum - max - min) / (score.length - 2);
        System.out.println("最终得分：" + result);
    }
    //定义一个方法使用数组存数据，并返回
    public static int[] getScores(){
        int[] score = new int[6];
        //键盘录入
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < score.length; ){
            System.out.println("请输入打分");
            int num = sc.nextInt();
            //排除异常输入
            if (num >= 1 && num <= 100){
                score[i] = num;
                i++;
            }else{
                System.out.println("输入非法，当前位置" + i);
            }

        }
        return score;
    }

    //定义一个方法求数组最大值
    public static int getMax(int[] score){
        int max= score[0];
        for (int i = 0; i <score.length; i++){
            if (score[i] > max){
                max = score[i];
            }
        }
        return max;
    }

    //定义一个方法求数组最小值
    public static int getMin(int[] score){
        int min= score[0];
        for (int i = 0; i <score.length; i++){
            if (score[i] < min){
                min = score[i];
            }
        }
        return min;
    }

    //定义一个方法求和
    public static int getSum(int[] score){
        int sum = 0;
        for (int i = 0; i <score.length; i++){
            sum += score[i];
        }
        return sum;
    }
}
