package com.huangzong.iotest02;

import java.io.Serial;
import java.io.Serializable;

//标记接口，表明可以序列号
public class Student implements Serializable {

    //序列号
    private static final long serialVersionUID = -6470011412226276122L;
    private String name;
    private int age;
    //transient:瞬态关键字，不会把当前属性序列化
    private transient String mj;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
