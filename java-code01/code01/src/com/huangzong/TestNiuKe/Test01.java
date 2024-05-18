package com.huangzong.TestNiuKe;

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("输入");
        String str = sc.nextLine();
        int count = 0;
        for (int i = str.length()-1; i >= 0; i--){
            char ch = str.charAt(i);
            if (ch == ' '){
                break;
            }
            count++;

            System.out.println(ch);
        }

        System.out.println(count);
    }
}
