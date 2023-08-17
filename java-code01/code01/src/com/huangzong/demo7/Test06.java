package com.huangzong.demo7;

import java.util.Random;
import java.util.Scanner;

public class Test06 {
    public static void main(String[] args) {
        //双色球彩票系统，前6位红色是1~33不重复数字，最后一位蓝色是1~16中选择
        //生成彩票号码
        int[] arr = getNumber();

        //用户输入彩票号码
        int[] userNumber = userInput();

        //判断用户中将情况
        int redCount = 0;
        int blueCount =0;
        //判断红球中奖个数
        for (int i = 0; i < userNumber.length-1; i++){
            int redNumber = userNumber[i];
            for (int j = 0; j < arr.length-1; j++){
                if (redNumber == arr[j]){
                    redCount++;
                    //找到了就进行下一个号码比较
                    break;
                }
            }
        }
        //判断蓝色球中奖个数
        int blueNumber = userNumber[userNumber.length-1];
        if (blueNumber == arr[arr.length-1]) {
            blueCount++;
        }
        //输出结果
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
        System.out.println("==============================");
        for (int i = 0; i < userNumber.length; i++) {
            System.out.print(userNumber[i] + "\t");
        }
        System.out.println();
        System.out.println("红球命中" + redCount);
        System.out.println("蓝色球命中" + blueCount);

    }

    //定义一个方法生成彩票号码
    public static int[] getNumber(){
        //定义一个数组存储数字号码
        int[] arr = new int[7];
        //随机生成前6位数字
        Random r = new Random();
        for (int i = 0; i < arr.length-1; ){
            int redNumber = r.nextInt(33)+1;
            //判断生成都数字是否在数组中
            boolean flag = contains(arr,redNumber);
            if(!flag){
                arr[i] = redNumber;
                i++;
            }
        }

        //生成最后一位数字
        int blueNumber = r.nextInt(16)+1;
        arr[arr.length-1] = blueNumber;
        //返回
        return  arr;
    }

    //定义一个方法判断生成的数字是否在数组中
    public static boolean contains(int[] arr, int number){
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == number){
                return true;
            }
        }
        return false;
    }

    //定义一个方法实现用户输入彩票号码
    public static int[] userInput(){
        //定义一个数组存储号码
        int[] userNumber = new int[7];
        //用户输入前6位红色号码
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < userNumber.length-1;){
            System.out.println("请输入" + (i+1) +"个红球号码");
            int redInput = sc.nextInt();
            //判断是否超出范围
            if (redInput >= 1 && redInput <= 33){
                //判断是否有重复
                boolean flag = contains(userNumber,redInput);
                if (!flag){
                    //不在数组内
                    userNumber[i] = redInput;
                    i++;
                }else{
                    System.out.println("有重复数字，请重新输入");
                }
            } else{
                System.out.println("输入的数字超出范围，请重新输入");
            }

        }

        //随机生成最后一位蓝色号码
        System.out.println("请输入蓝色球号码");
        while(true){
            int blueInput = sc.nextInt();
            if (blueInput >= 1 && blueInput <= 16){
                userNumber[userNumber.length-1] = blueInput;
                break;
            }else{
                System.out.println("输入的数字超出范围，请重新输入");
            }
        }
        //返回
        return userNumber;
    }
}
