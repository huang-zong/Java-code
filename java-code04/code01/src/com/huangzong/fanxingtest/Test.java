package com.huangzong.fanxingtest;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {

        //创建集合
        ArrayList<HuskyDog> list1 = new ArrayList<>();
        ArrayList<TeddyDog> list2 = new ArrayList<>();
        ArrayList<PersianCat> list3 = new ArrayList<>();
        ArrayList<LiHuaCat> list4 = new ArrayList<>();

        //创建对象
        LiHuaCat lihua = new LiHuaCat("xiaohua" , 3);
        PersianCat persian = new PersianCat("xiaobo" , 4);
        TeddyDog teddy = new TeddyDog("xiaotai" ,5);
        HuskyDog husky = new HuskyDog("xiaoha" , 2);

        list1.add(husky);
        list2.add(teddy);
        list3.add(persian);
        list4.add(lihua);

        keepPet(list3 , persian);
        keepPet(list4 , lihua);
        keepPet(list1 , husky);
        keepPet(list2 , teddy);

    }

    //该方法能养所有品种的猫，但是不能养狗
    public static void keepPet(ArrayList<? extends Cat> list , Cat cat){
        cat.eat();
    }

    //该方法能养所有品种的狗，但是不能养猫
    public static void keepPet(ArrayList<? extends Dog> list , Dog dog){
        dog.eat();
    }

    //该方法能养所有的动物，但是不能传递其他类型
    public static void keepPet(ArrayList<? extends Animal> list , Animal animal){
        animal.eat();
    }
}
