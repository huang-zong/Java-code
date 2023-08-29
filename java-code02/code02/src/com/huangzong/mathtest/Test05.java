package com.huangzong.mathtest;

import java.time.LocalDate;
import java.util.Calendar;

public class Test05 {
    public static void main(String[] args) {
        //使用JDK7和JDK8判断是否位闰年，方法有二月29天，或者一年366天
        //JDK7
        //创建一个日历对象
        Calendar calendar = Calendar.getInstance();
        //设置日期
        calendar.set(2000 , 2 , 1); // 月份0~11
        //把日历往前减一天
        calendar.add(Calendar.DAY_OF_MONTH, -1);
        //获取日期
        int day1 = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(day1);

        //JDK8
        //设置时间
        LocalDate localDate = LocalDate.of(2000, 3 , 1); //月份1~12
        //把时间往前减一天
        LocalDate day2 = localDate.minusDays(1);
        System.out.println(day2);


        //判断是否闰年
        System.out.println(localDate.isLeapYear());
    }
}
