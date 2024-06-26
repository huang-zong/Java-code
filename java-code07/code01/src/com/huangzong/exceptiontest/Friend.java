package com.huangzong.exceptiontest;

public class Friend {
    private String name;
    private int age;

    public Friend() {
    }

    public Friend(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() < 3 || name.length() > 10){
            throw new NameFormatException(name + "格式错误，长度3~10");
        }else {
            this.name = name;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 18 || age > 40){
            throw new AgeOutOfBoundsException(age + "超出范围，范围18~40");
        }else {
            this.age = age;
        }
    }

    @Override
    public String toString() {
        return "Friend{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
