package com.huangzong.filetest01;

import java.io.File;
import java.io.IOException;

public class FileTest03 {
    public static void main(String[] args) throws IOException {
        //创建文件
        File file = new File("D:\\javacode\\a.txt");
        System.out.println(file.createNewFile());

        //创建单级目录
        File file1 = new File("D:\\javacode\\aaa");
        System.out.println(file1.mkdir());

        //创建多级目录
        File file2 = new File("D:\\javacode\\aaa\\bbb\\ccc");
        System.out.println(file2.mkdirs());

        //删除文件、删除空文件夹
        System.out.println(file.delete());
        System.out.println(file2.delete());
    }
}
