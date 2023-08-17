package com.huangzong.demo9;

public class GirlFriendTest {
    public static void main(String[] args) {
        //创建女朋友对象
        GirlFriend gf = new GirlFriend();
        gf.setName("小溪");
        gf.setAge(18);
        gf.setGender("女");

        System.out.println(gf.getName());
        System.out.println(gf.getAge());
        System.out.println(gf.getGender());

        gf.eat();
        gf.sleep();
    }
}
