package com.huangzong.treetest;

import java.util.Objects;

public class Student implements Comparable<Student>{
    private String name;
    private int age;

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

    @Override
    public int compareTo(Student o) {
        int cha = this.getAge() - o.getAge();
        cha = cha == 0 ? this.getName().compareTo(o.getName()) : cha;

        //返回值：负数表示当前要添加的元素小，存红黑树左边
        //正数表示当前要添加的元素大，存红黑树右边
        //0表示已经存在，舍弃
        return cha;
    }
}
