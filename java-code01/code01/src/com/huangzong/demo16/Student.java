package com.huangzong.demo16;

public class Student {
    //成员变量
    private String name;
    private int age;
    //空参构造
    public Student(){}

    //带参构造
    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }
    //get和set
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
}
