package com.huangzong.mathtest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Test04 {
    public static void main(String[] args) throws ParseException {
        //计算时间间隔，使用JDK7和JDK8两种方式
        //JDK7,只要对时间进行计算或者判断，都需要先获取时间的毫秒值
        //计算生日的毫秒值
        String birthday = "2000年1月1日";
        //解析格式
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日");
        //创建一个对象
        Date date = simpleDateFormat.parse(birthday);
        //获取时间毫秒值
        long birthTime = date.getTime();
        //获取当前时间毫秒值
        long today = System.currentTimeMillis();
        //计算间隔时间
        long result = today - birthTime;
        //输出
        System.out.println(result / 1000 / 60 / 60 / 24);


        //JDK8
        //出生日期
        LocalDate birthDate = LocalDate.of(2000 , 1, 1);
        //现在时间
        LocalDate todayDate = LocalDate.now();
        //计算间隔时间
        long re = ChronoUnit.DAYS.between(birthDate, todayDate);
        System.out.println(re);
    }
}
