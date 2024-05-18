package com.huangzong.demo16;


import java.util.ArrayList;
import java.util.Scanner;

public class StudentTest01 {
    public static void main(String[] args) {
        //创建集合
        ArrayList<Student> list = new ArrayList<>();
        //键盘录入学生对象
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            Student stu = new Student();
            System.out.println("请输入学生姓名");
            String name = sc.next();
            System.out.println("请输入学生年龄");
            int age = sc.nextInt();
            stu.setName(name);
            stu.setAge(age);
            list.add(stu);
        }
        //遍历
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println(stu.getName() + "," + stu.getAge());
        }
    }
}
