package com.huangzong.datetest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class DateTest {
    public static void main(String[] args) throws ParseException {
        //打印时间原点开始一年后的时间
        getNextYear();

        //定义任意两个Date对象，比较哪一个时间在前，哪一个时间在后
        compareTime();
    }

    private static void compareTime() {
        Random r = new Random();
        //创建两个对象
        Date date1 = new Date(Math.abs(r.nextInt()));
        Date date2 = new Date(Math.abs(r.nextInt()));
        //获取时间毫秒值
        long time1 = date1.getTime();
        long time2 = date2.getTime();
        if (time1 > time2){
            System.out.println(date1);
            System.out.println();
            System.out.println(date2);
            System.out.println("第一个大");
        }else if (time1 < time2){
            System.out.println(date1);
            System.out.println();
            System.out.println(date2);
            System.out.println("第二个大");
        }else {
            System.out.println(date1);
            System.out.println();
            System.out.println(date2);
            System.out.println("一样大");
        }
    }

    private static void getNextYear() {
        //创建一个对象，表示时间原点
        Date date1= new Date(0L);
        //获取时间的毫秒值
        long time = date1.getTime();
        //计算一年后的时间
        time += 1000L * 60 * 60 * 24 * 365;
        //设置为一年后的时间
        date1.setTime(time);
        //打印
        System.out.println(date1);
    }
}
