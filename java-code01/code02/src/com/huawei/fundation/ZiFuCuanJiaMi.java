package com.huawei.fundation;

import java.util.Scanner;

public class ZiFuCuanJiaMi {
    public static void main(String[] args){
        //键盘录入整数n
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //去掉换行符
        sc.nextLine();
        //定义数组存储前三位数据
        int[] a = new int[]{1,2,4};
        //定义数组存储n组数据
        String[] strN= new String[n];
        //键盘录入n组测试数据
        for (int i = 0; i < n; i++){
            String str = sc.nextLine();
            int len = str.length();
            StringBuilder sb = new StringBuilder();
            //定义数组存储
            int[] b = new int[len];
            for (int j = 0; j < len; j++ ){
                char ch = str.charAt(j);
                if (j < 3){
                    b[j] = a[j];
                }else {
                    b[j] = getNumArr(b,j);
                }
                b[j] %= 26;
                ch += (char) b[j];
                if (ch >= 'a' && ch <= 'z'){
                    sb.append(ch);
                }else {
                    ch -=(char) 26;
                    sb.append(ch);
                }
            }
            strN[i] = sb.toString();
        }
        //输出
        for (int i = 0; i < n; i++){
            System.out.println(strN[i]);
        }
    }
    //定义方法获得数组元素
    public static int getNumArr(int[] b ,int j){
        return b[j-1] + b[j-2] + b[j-3];
    }
}
