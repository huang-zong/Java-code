package com.huangzong.filetest01;

import java.io.File;

public class FileTest04 {
    public static void main(String[] args) {
        //获取当前路径下所有内容
        File file = new File("D:\\javacode");
        File[] files = file.listFiles();
        for (File file1 : files) {
            System.out.println(file1);
        }
    }
}
