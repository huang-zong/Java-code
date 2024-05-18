package com.huawei.fundation;

import java.util.Scanner;

public class ShiJianTuiSong {
    public static void main(String[] args){
        //键盘录入m,n,R
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int R = sc.nextInt();
        //定义数组A和B存储数据
        int[] A = new int[m];
        int[] B = new int[n];
        //循环录入数组A和B
        for (int i = 0; i < m; i++){
            A[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++){
            B[i] = sc.nextInt();
        }
        StringBuilder sb = new StringBuilder();
        //双循环寻找数对
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                if (A[i] <= B[j]){
                    if (B[j] - A[i] <= R){
                        sb.append(A[i]).append(B[j]);
                        break;
                    }
                }
            }
        }
        //输出结果
        for (int i = 0; i < sb.length()-1; ){
            System.out.print(sb.charAt(i) + " " + sb.charAt(i+1));
            System.out.println();
            i += 2;
        }
    }
}
