package com.huangzong.filetest02;

import java.io.File;

public class FileTest05 {
    public static void main(String[] args) {
        //统计文件夹大小
        //创建对象
        File file = new File("D:\\javacode\\image");
        System.out.println(getLen(file) / 1024 /1024);
    }

    //定义方法统计文件夹大小
    public static long getLen(File file){
        //定义变量统计打下去
        long len = 0;
        //进入文件夹
        File[] files = file.listFiles();
        //遍历
        for (File file1 : files) {
            //判断是否文件
            if (file1.isFile()){
                len += file1.length();
            }else {
                //文件夹则递归调用
                len += getLen(file1);
            }
        }
        return len;
    }
}
