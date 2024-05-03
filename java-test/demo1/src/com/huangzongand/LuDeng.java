package com.huangzongand;

import java.util.ArrayList;
import java.util.Scanner;

public class LuDeng {
    public static void main(String[] args){
        //键盘录入路灯数量N
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        //键盘录入N个路灯的照明半径
        String str = sc.nextLine();
        //去掉” “ 存入数组
        String[] strNum = str.split(" ");
        //存入整型数组
        long[] ban = new long[strNum.length];
        for (int i = 0; i < ban.length; i++){
            ban[i] = Long.parseLong(strNum[i]);
        }
        //定义数组存储路灯无法照明长度
        long[] result = new long[ban.length-1];
        ArrayList<Integer> list = new ArrayList<>();
        //将半径大于100的路灯下标记录
        for (int i = 0; i < ban.length; i++){
            if (ban[i] > 100){
                list.add(i);
            }
        }
        //计算半径小于50的路灯之间的黑暗区域
        for (int i = 0; i < ban.length-1; i++){
            if (ban[i] + ban[i+1] < 100){
                result[i] = 100 - ban[i] - ban[i+1];
            }else {
                result[i] = 0;
            }
        }
        //判断半径大于100的路灯是否可以覆盖黑暗区域
        for (int i = 0; i < list.size(); i++){
            //获得下标
            int index = list.get(i);
            //获得半径
            long banjin = ban[index];
            for (int j = 0; j < result.length; j++){
                //对半径取余
                int num1 =(int) banjin % 100;
                //对半径做除法
                int num2 =(int) banjin / 100;
                //对第一个路灯处理
                if (index == 0){
                    for (int k = 0; k < num2; k++){
                        result[k] = 0;
                        if (num1 > ban[num2]){
                            result[num2] = result[num2] - (num1 - ban[num2]);
                        }
                    }
                }else if (index == N-1){
                    //最后一个路灯处理
                    for (int k = N-2; k > N - 2 - num2; k--){
                        result[k] = 0;
                        if (num1 > ban[N - 1 - num2]){
                            result[N - 2 - num2] = result[N - 2 - num2] - (num1 - ban[N - 1 - num2]);
                        }
                    }
                }else {
                    for (int k = index; k < index + num2; k++){
                        result[k] = 0;
                        if (num1 > ban[num2]){
                            result[num2] = result[num2] - (num1 - ban[num2]);
                        }
                        if (k >= N-1){
                            break;
                        }
                    }
                    for (int k = index-1; k > N - 2 - num2; k--){
                        result[k] = 0;
                        if (num1 > ban[N - 1 - num2]){
                            result[N - 2 - num2] = result[N - 2 - num2] - (num1 - ban[N - 1 - num2]);
                        }
                    }
                }
            }
        }
        //计算黑暗区域和
        int sum = 0;
        for (int i = 0; i < result.length; i++){
            sum += result[i];
        }
        System.out.println(sum);
    }
}
