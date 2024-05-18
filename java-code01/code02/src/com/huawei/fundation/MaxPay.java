package com.huawei.fundation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class MaxPay {
    public static void main(String[] args){
        //最大花费金额问题，对所有商品升序排序，选择第一件商品price1 < 额度R，第二件商品 price1+price2 < 额度，类推
        //键盘录入整数字符串
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        //定义额度的变量
        int R = sc.nextInt();
        //去掉","使用字符串数组存储
        String[] str1 = str.split(",");
        //转换成整型数组存储
        int[] price = new int[str1.length];
        for (int i = 0; i < price.length; i++){
            price[i] = Integer.parseInt(str1[i]);
        }
        //升序排序
        Arrays.sort(price);
        //创建一个集合存储组合价格
        ArrayList<Integer> list = new ArrayList<>();
        //定义一个标记
        boolean flag = false;
        //三层循环遍历求出所有满足条件的组合价格存入数组
        for (int i = price.length-1; i >= 2; i--){
            //如果price大于额度R则进行下一次循环
            if (price[i] > R){
                continue;
            }
            for (int j = i -1; j >=1; j--){
                //如果两件价格加起来大于额度则进行下一次循环
                if (price[i] + price[j] > R){
                    continue;
                }
                for (int k = j-1; k >=0; k--){
                    int sum = price[i] + price[j] + price[k];
                    if (sum <= R){
                        list.add(sum);
                        flag = true;
                    }
                }
            }

        }

        if (!flag){
            System.out.println(-1);
        }else {
            //求出最大的组合价格输出
            Integer max = Collections.max(list);
            System.out.println(max);
        }

    }
}
