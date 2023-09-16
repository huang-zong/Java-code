package com.huangzong.exceptiontest;

import java.util.Scanner;

public class ExceptionTest03 {
    public static void main(String[] args) {
        //自定义异常
        //键盘录入
        Scanner sc = new Scanner(System.in);
        //创建对象
        Friend friend = new Friend();

        while (true) {
            try {
                //输入姓名
                System.out.println("请输入姓名");
                String name = sc.nextLine();
                friend.setName(name);

                //输入年龄
                System.out.println("请输入年龄");
                int age = Integer.parseInt(sc.nextLine());
                friend.setAge(age);
                break;
            } catch (NumberFormatException e) {
                e.printStackTrace();
            } catch (NameFormatException e){
                System.out.println("姓名有误，请重新输入");
                e.printStackTrace();
            } catch (AgeOutOfBoundsException e){
                System.out.println("年龄范围有误，请重新输入");
                e.printStackTrace();
            }
        }

        //打印结果
        System.out.println(friend);
    }
}
