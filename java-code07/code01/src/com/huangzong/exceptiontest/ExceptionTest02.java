package com.huangzong.exceptiontest;

import java.util.Scanner;

public class ExceptionTest02 {
    public static void main(String[] args) {
        //抛出异常，捕获异常
        //键盘录入
        Scanner sc = new Scanner(System.in);
        //创建对象
        GirlFriend gf = new GirlFriend();
        while (true) {
            try {
                //输入姓名
                System.out.println("请输入姓名");
                String name = sc.nextLine();
                gf.setName(name);

                //输入年龄
                System.out.println("请输入年龄");
                int age = Integer.parseInt(sc.nextLine());
                gf.setAge(age);
                break;
            } catch (NumberFormatException e) {
                System.out.println("输入年龄有误，请重新输入");
            } catch (RuntimeException e){
                System.out.println("输入姓名或年龄有误，请重新输入");
            }
        }

        //输出结果
        System.out.println(gf);

    }
}
