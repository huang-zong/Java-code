package com.huawei.fundation;

import java.util.*;

public class XuanXiuKe {
    public static void main(String[] args){
        //键盘录入两行数据
        Scanner sc = new Scanner(System.in);
        //去掉“;"存入字符串数组
        String[] first = sc.nextLine().split(";");
        String[] second = sc.nextLine().split(";");
        //定义两个数组
        Long[] firstInput = new Long[first.length];
        Long[] secondInput = new Long[second.length];
        //定义集合存储
        ArrayList<String> listFirstInput = new ArrayList<>();
        ArrayList<String> listSecondInput = new ArrayList<>();
        //去掉","存入二维数组
        for (int i = 0 ; i < first.length; i++ ){
            listFirstInput.add(first[i].substring(0,8));
            firstInput[i] = Long.parseLong(first[i].substring(9));
        }
        for (int i = 0; i < second.length; i++){
            listSecondInput.add(second[i].substring(0,8));
            secondInput[i] = Long.parseLong(second[i].substring(9));
        }
        //定义变量标记是否有两门选修课学生
        boolean flag = false;
        //定义一个变量计数
        int count = 0;
        //定义集合存储数组下标
        ArrayList<Integer> listIndex = new ArrayList<>();
        ArrayList<Integer> listIndex1 = new ArrayList<>();
        //定义集合存储班级
        ArrayList<String> list = new ArrayList<>();
        //根据学号判断是否有选修两门课程的学生，有则将成绩相加，没有则输出NULL
        for (int i = 0; i < firstInput.length; i++){
            for (int j = 0; j < secondInput.length; j++){
                if (listFirstInput.get(i).equals(listSecondInput.get(j))){
                    //将下标存入集合
                    listIndex.add(i);
                    listIndex1.add(j);
                    flag = true;
                    count++;
                    //排除相同数据,截取班级
                    if (!list.contains(listFirstInput.get(i).substring(0,5))){
                        list.add(listFirstInput.get(i).substring(0,5));
                    }
                }
            }
        }
        //定义二维数组存入结果
        Long[] result = new Long[count];
        //定义集合存储学号
        ArrayList<String> listResult = new ArrayList<>();
        for (int i = 0; i < count; i++){
            int index = listIndex.get(i);
            int index1 = listIndex1.get(i);
            listResult.add(listFirstInput.get(index));
            result[i] = firstInput[index] + secondInput[index1];
        }
        //排序
        for (int i = 0; i < count-1; i++){
            if (result[i] < result[i+1]){
                //按选修课成绩降序排序
                long temp = result[i];
                String temp1 = listResult.get(i);
                String temp2 = listResult.get(i+1);
                result[i] = result[i+1];
                listResult.set(i,temp2);
                result[i+1] = temp;
                listResult.set(i+1,temp1);
            }else if (Objects.equals(result[i], result[i + 1])){
                //成绩相同时按学号升序排序
                String temp1 = listResult.get(i);
                String temp2 = listResult.get(i+1);
                listResult.set(i,temp2);
                listResult.set(i+1,temp1);
            }
        }
        Collections.sort(list);
        if (flag){
            for (int i = 0; i < list.size(); i++){
                //输出班级编号
                System.out.println(list.get(i));
                for (int j = 0; j <count; j++){
                    if (list.get(i).equals(listResult.get(j).substring(0,5))){
                        if (j != count-1){
                            System.out.print(listResult.get(j) +"," + result[j] +";");
                        }else {
                            System.out.println(listResult.get(j) +"," + result[j]);
                        }
                    }
                }
            }
        }else {
            System.out.println("NULL");
        }
    }
}
