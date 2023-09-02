package com.huangzong.test;

import java.util.Arrays;
import java.util.Comparator;

public class GirlFriendTest {
    public static void main(String[] args) {
        //定义数组存储一些女朋友对象，利用Arrays中的sort方法进行排序
        //要求：按照年龄大小排序，相同则按照身高排序，相同则按照姓名字母排序

        //创建对象
        GirlFriend gf1 = new GirlFriend("xiaowang", 17, 1.72);
        GirlFriend gf2 = new GirlFriend("xiaolin", 20, 1.62);
        GirlFriend gf3 = new GirlFriend("xiaoyun", 17, 1.72);

        //定义数组存储
        GirlFriend[] arr = new GirlFriend[]{gf1, gf2, gf3};

        //定义sort方法进行排序
        //匿名内部类
       /* Arrays.sort(arr, new Comparator<GirlFriend>() {
            @Override
            public int compare(GirlFriend o1, GirlFriend o2) {
                double temp = o1.getAge() - o2.getAge();
                temp = temp == 0 ? o1.getHeight() - o2.getHeight() : temp;
                temp = temp == 0 ? o1.getName().compareTo(o2.getName()) : temp;
                if (temp > 0){
                    return 1;
                }else if (temp < 0){
                    return -1;
                }else {
                    return 0;
                }
            }
        });*/

        //lambda表达式
        Arrays.sort(arr, (o1, o2)->{
                double temp = o1.getAge() - o2.getAge();
                temp = temp == 0 ? o1.getHeight() - o2.getHeight() : temp;
                temp = temp == 0 ? o1.getName().compareTo(o2.getName()) : temp;
                if (temp > 0){
                    return 1;
                }else if (temp < 0){
                    return -1;
                }else {
                    return 0;
                }
            }
        );


        //输出打印
        System.out.println(Arrays.toString(arr));
    }
}
