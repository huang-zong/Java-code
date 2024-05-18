package com.huawei.fundation;

import java.util.ArrayList;
import java.util.Scanner;

public class EncryptWord {
    public static void main(String[] args){
        //敏感字加密，包含大小写字母，数字，下划线，偶数个双引号，以下划线进行分割

        //键盘录入命令字索引k
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        sc.nextLine();
        //键盘录入命令字符串s
        String str = sc.nextLine();
        //创建集合存储字符串
        ArrayList<String> list = new ArrayList<>();
        //循环遍历截取字符串
        StringBuilder sb = new StringBuilder();
        //定义一个变量存储命令字个数
        int startIndex = 0;
        //定义一个变量表示双引号
        boolean flag = false;
        for (int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);

            //判断是否引号
            if (ch == '\"'){
                flag = !flag;
            }

            //双引号内部字符串是一个命令字串
            if (flag){
                sb.append(ch);
            }else {
                //执行到这里说明不在双引号里面

                if (ch == '_'){
                    if (i != 0){
                        list.add(sb.substring(startIndex+1,i));

                    }
                    startIndex = i;
                }else {
                    if (i == 0){
                        startIndex--;
                    }
                }
                sb.append(ch);

                //截取最后一段
                if (i == str.length()-1){
                    list.add(sb.substring(startIndex+1,i+1));
                }

            }
        }

        StringBuilder sb1 = new StringBuilder();
        //添加*
        int count = list.size();
        String encrypt = "******";
        if (k >= count){
            System.out.println("ERROR");
        }else{
            for (int i = 0; i < list.size(); i++){
                if (k == i){
                    sb1.append(encrypt);
                }
                if(k!= i){
                    sb1.append(list.get(i));
                }
                if(i != list.size()-1){
                    sb1.append("_");
                }
            }
        }

        System.out.println(sb1);
    }
}
