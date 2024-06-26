package com.huangzong.filetest02;

import java.io.File;

public class FileTest02 {
    public static void main(String[] args) {
        //定义一个方法找某一个文件夹中，是否有以java结尾的文件
        //创建对象
        File file = new File("D:\\javacode");
        //调用方法
        System.out.println(haveTxt(file));

    }

    //定义方法查找
    public static boolean haveTxt(File file){
        //获取文件夹或文件
        File[] files = file.listFiles();
        for (File f : files) {
            //是文件且以.txt结尾
            if (f.isFile() && f.getName().endsWith(".java")){
                return true;
            }
        }
        //没有找到
        return false;
    }
}
