package com.huangzong.demo25;

public class Test {
    public static void main(String[] args) {
        //匿名内部类

        //实现了Swim接口的匿名内部类对象
        new Swim(){

            @Override
            public void swim() {
                System.out.println("重写了swim方法");
            }
        }.swim();

        //继承了Animal的匿名内部类对象
        new Animal(){

            @Override
            public void eat() {
                System.out.println("重写了eat方法");
            }
        };


        method(
                new Animal(){

                    @Override
                    public void eat() {
                        System.out.println("重写了eat方法");
                    }
                }
        );


    }

    public static void method(Animal a){
        a.eat();
    }
}
