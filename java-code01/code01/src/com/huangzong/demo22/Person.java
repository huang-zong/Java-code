package com.huangzong.demo22;

public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
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

    public void keepPet(Animal a, String something){
        if (a instanceof Dog d){
            System.out.println(age + "岁的" + name + "养了一只" + a.getColor() + "的" + a.getAge() + "岁的狗");
            d.eat(something);
        }else if (a instanceof Cat c){
            System.out.println(age + "岁的" + name + "养了一只" + a.getColor() + "的" + a.getAge() + "岁的猫");
            c.eat(something);
        }

    }
}
