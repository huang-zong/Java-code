package com.huangzong.datetest;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest {
    public static void main(String[] args) {
        //测试Calendar
        //创建一个对象
        Calendar calendar = Calendar.getInstance();
        //修改日历代表时间
        Date date1 = new Date(0L);
        calendar.setTime(date1);
        //输出
        System.out.println(calendar);
        //获取日历
        getCalendar(calendar);

        //设置日历
        calendar.set(Calendar.YEAR , 2023);
        calendar.set(Calendar.MONTH , 11);
        calendar.set(Calendar.DATE , 11);
        //输出
        getCalendar(calendar);

        //增加日历
        calendar.add(Calendar.YEAR , 1);
        calendar.add(Calendar.MONTH , -1);
        //输出
        getCalendar(calendar);
    }

    private static void getCalendar(Calendar calendar) {
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) + 1; //calendar 定义月份0~11
        int date = calendar.get(Calendar.DATE);
        int week = calendar.get(Calendar.DAY_OF_WEEK); //calendar 定义1表示星期日 2表示星期一 类推
        //输出
        System.out.println(year + "," + month + "," + date + "," + week);
    }
}
