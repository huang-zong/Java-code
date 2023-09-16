package com.huangzong.filetest01;

import java.io.File;

public class FileTest05 {
    public static void main(String[] args) {
        //创建对象
        File file = new File("D:\\javacode");
        File[] arr = file.listFiles();
        for (File file1 : arr) {
            if (file1.isFile() && file1.getName().endsWith(".java")){
                System.out.println(file1);
            }
        }
    }
}
