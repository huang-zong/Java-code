package com.huangzong.demo16;

import java.util.ArrayList;

public class UserTest {
    public static void main(String[] args) {
        //创建一个集合
        ArrayList<User> list = new ArrayList<>();
        //创建对象
        User u1 = new User("aaa101","zhangsna", 123456);
        User u2 = new User("aaa102","lis", 12345687);
        User u3 = new User("aaa103","wann", 123456100);

        //添加元素
        list.add(u1);
        list.add(u2);
        list.add(u3);
        //调用方法根据Id查找信息
        boolean result = contains(list,"aaa101");
        System.out.println(result);
    }

    //定义一个方法根据id查找信息
    public static boolean contains(ArrayList<User> list, String id){
        for (int i = 0; i < list.size(); i++) {
            return  list.get(i).getId().equals(id);
        }
        return false;
    }
}
