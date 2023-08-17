package com.huangzong.demo9;

import org.w3c.dom.ls.LSOutput;

import java.security.PrivateKey;

public class GirlFriend {
    //成员变量
    private String name;
    private int age;
    private String gender;

    //无参构造方法
    public GirlFriend(){}

    //带参构造方法
    public  GirlFriend(String name, int age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    //set和get
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    public void setGender(String gender){
        this.gender = gender;
    }
    public String getGender(){
        return  gender;
    }

    //成员方法
    public void sleep(){
        System.out.println("在睡觉");
    }
    public void eat(){
        System.out.println("在吃饭");
    }
}
