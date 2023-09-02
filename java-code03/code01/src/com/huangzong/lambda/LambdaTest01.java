package com.huangzong.lambda;

public class LambdaTest01 {
    public static void main(String[] args) {
        //lambda表达式

        method(new Swim() {
            @Override
            public void swimming() {
                System.out.println("重写了方法");
            }
        });

        method(()->{
                System.out.println("lambda表达式");
            }
        );

    }

    //定义方法调用接口方法
    public static void method(Swim s){
        s.swimming();
    }
}
