package com.huangzong.demo23;

public class Test {
    public static void main(String[] args) {
        //创建对象
        Frog f = new Frog("小青",2);
        f.eat();
        f.swim();
        System.out.println(f.getName() + "," + f.getAge());
    }
}
