package com.huangzong.filetest01;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileTest02 {
    public static void main(String[] args) {
        //获取文件最后的修改时间
        File file = new File("D:\\javacode\\HelloWorld.java");
        //判断是否为文件夹
        System.out.println(file.isDirectory());
        //判断是否为文件
        System.out.println(file.isFile());
        //判断是否为空
        System.out.println(file.exists());

        //获取文件大小
        System.out.println(file.length());
        //获取文件绝对路径名
        System.out.println(file.getAbsolutePath());
        //获取定义文件时使用的路径
        System.out.println(file.getPath());
        //获取文件的名称
        System.out.println(file.getName());
        //获取文件的最后修改时间
        long lastModified = file.lastModified();
        //将时间毫秒转换为yyyy年MM月dd月 HH:mm:ss
        Date date = new Date(lastModified);
        //转换为自定义格式时间
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        String format = simpleDateFormat.format(date);
        System.out.println(format);
    }
}
