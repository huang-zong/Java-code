package com.huangzong.datetest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateTest {
    public static void main(String[] args) throws ParseException {
        //获取指定格式都时间
        getTime();

        //解析指定格式对象
        method();

        //将2023-11-11转换为2023年11月11日
        method2();
    }

    private static void method2() throws ParseException {
        String str = "2023-11-11";
        //创建对象解析
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyy-MM-dd");
        //创建Date对象
        Date date = simpleDateFormat1.parse(str);
        //创建对象格式化
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy年MM月dd日");
        //格式化
        String result = simpleDateFormat2.format(date);
        //输出
        System.out.println(result);
    }

    private static void method() throws ParseException {
        String str = "2023-11-11 11:11:11";
        //解析
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //获取Date对象
        Date date = simpleDateFormat2.parse(str);
        //打印
        System.out.println(date);
        //获取毫秒值
        long time = date.getTime();
        System.out.println(time);
    }

    private static void getTime() {
        //利用空参构造创建SimpleDateFormat对象，默认格式
        SimpleDateFormat simpleDateFormat1= new SimpleDateFormat();
        //创建一个时间原点对象
        Date date1= new Date(0L);
        //格式化
        String str = simpleDateFormat1.format(date1);
        //输出
        System.out.println(str);
    }
}
