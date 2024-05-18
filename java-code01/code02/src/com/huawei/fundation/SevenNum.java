package com.huawei.fundation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SevenNum {
    public static void main(String[] args){
        //N个人围成一圈，从1开始喊数，喊道7的倍数或者包含7则喊过
        //给定长度为N的数组，存储了喊过的次数，打乱了顺序的，数组下标是对应的每个人的编号，要求还原顺序，对数组重新排序
        //对数组重新排序，即确定第一个喊7、14、17、21、、、的人的位置
        //首先，喊过的次数可能全是0 ，可能<=1，可能>=2
        //每个人报的数和编号的对应关系是num % N -1，因为编号是从1开始的所以减1
        //喊的数不超过200

        //键盘录入字符串
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        //去掉” “ 存入字符串数组
        String[] str1 = str.split(" ");

        //存入整型数组方便后面计算
        int[] times = new int[str1.length];
        for (int i = 0; i < times.length; i++){
            times[i] = Integer.parseInt(str1[i]);
        }
        //while循环模拟喊数的过程
        //定义一个变量结束喊数的过程
        boolean flag = true;
        //创建一个数组存储喊过的次数
        int[] newTimes = new int[str1.length];
        //定义变量计数
        int number  = 1;
        while(flag){
            //判断是哪个编号喊的数
            int index = number % times.length - 1;
            if (number % times.length == 0){
                index = times.length-1;
            }
            //判断number是否7的倍数或者包含7
            if (number % 7 == 0 || checkSeven(number)){
                newTimes[index] += 1;
            }else {
                newTimes[index] += 0;
            }

            //获取最大值
            int newMax = Arrays.stream(newTimes).max().getAsInt();
            int max = Arrays.stream(times).max().getAsInt();;
            if ((number >= 200) || (max == newMax)){
                flag = false;
            }
            number++;

        }
        for (int i = 0; i <newTimes.length; i++){
            System.out.print(newTimes[i] + " ");
        }
    }

    //定义一个方法判断是否包含7
    public static boolean checkSeven(int number){
        while (true){
            int ge = number % 10;
            number /= 10;
            if (ge == 7){
                return true;
            }else {
                return false;
            }
        }
    }
}
