package com.huangzong.demo20;

public class SharPei extends Dog{
    //需要重写
    @Override
    public void eat(){
        super.eat();
        System.out.println("吃骨头");
    }
}
