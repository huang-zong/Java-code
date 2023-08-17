package com.huangzong.demo12;

import jdk.jshell.Snippet;

import java.util.Scanner;

public class CarTest {
    public static void main(String[] args) {
        //对象数组存储
        //创建对象数组
        Car[] arr = new Car[3];
        //将对象添加到数组
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++){
            //创建对象
            Car car = new Car();
            //输入品牌
            System.out.println("请输入品牌");
            String brand = sc.next();
            car.setBrand(brand);
            //输入价格
            System.out.println("请输入价格");
            int price = sc.nextInt();
            car.setPrice(price);
            //输入颜色
            System.out.println("请输入颜色");
            String color = sc.next();
            car.setColor(color);
            //存入数组
            arr[i] = car;
        }
        //遍历输出
        for (int i = 0; i <arr.length; i++){
            Car car= arr[i];
            System.out.println(car.getBrand() + "," + car.getPrice() + "," + car.getColor());
        }
    }
}
