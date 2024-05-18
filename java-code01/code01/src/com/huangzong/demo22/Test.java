package com.huangzong.demo22;

public class Test {
    public static void main(String[] args) {
        //创建一个对象
        Person p = new Person("laowang",25);

        Dog d = new Dog(2,"黑色");
        Cat c = new Cat(3,"白色");

        p.keepPet(d,"骨头");
        p.keepPet(c,"小鱼干");

    }
}
