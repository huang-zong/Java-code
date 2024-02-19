package com.huangzong.filetest01;

import java.io.File;

public class FileTest01 {
    public static void main(String[] args) {
        //根据字符串表示的路劲，创建file对象
        String str = "C:\\User\\Desktop\\a.txt";
        //创建对象
        File file1 = new File(str);
        System.out.println(file1);

        //父路径和子路径拼接
        String parent = "C:\\User\\Desktop";
        String child = "a.txt";
        File file2 = new File(parent, child);
        System.out.println(file2);

        //file表示的路径和string表示的路径拼接
        File parent1 = new File(parent);
        File file3 = new File(parent1,child);
        System.out.println(file3);
    }
}
