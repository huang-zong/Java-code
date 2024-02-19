package com.huangzong.filetest02;

import java.io.File;
import java.io.IOException;

public class FileTest04 {
    public static void main(String[] args) throws IOException {
        //删除文件（需要考虑子文件夹）
        creatDir();
    }

    //定义方法创建多级文件
    public static void creatDir() throws IOException {
        //创建文件夹
        File file = new File("D:\\javacode\\aaa\\bbb\\ccc");
        System.out.println(file.mkdirs());
        //创建对象文件夹
        File file1 = new File("D:\\javacode\\aaa\\ddd\\eee");
        System.out.println(file1.mkdirs());
        //创建文件
        File file2 = new File("D:\\javacode\\aaa\\a.txt");
        System.out.println(file2.createNewFile());
        File file3 = new File("D:\\javacode\\aaa\\bbb\\b.txt");
        System.out.println(file3.createNewFile());
        File file4 = new File("D:\\javacode\\aaa\\bbb\\ccc\\c.txt");
        System.out.println(file4.createNewFile());
        File file5 = new File("D:\\javacode\\aaa\\ddd\\d.txt");
        System.out.println(file5.createNewFile());
        File file6 = new File("D:\\javacode\\aaa\\ddd\\eee\\e.txt");
        System.out.println(file6.createNewFile());

        //调用方法删除
        File deleteFile = new File("D:\\javacode\\aaa");
        deleteDir(deleteFile);
    }

    //定义方法删除文件夹
    public static void deleteDir(File file){
        //进入文件夹
        File[] files = file.listFiles();
        //遍历
        for (File file1 : files) {
            //判断，是文件则删除
            if (file1.isFile()){
                //获取文件或文件夹名并打印
                System.out.println(file1.getPath());
                file1.delete();
            }else {
                //是文件夹则递归调用
                deleteDir(file1);
            }
        }
        //最后删除自己
        file.delete();
    }
}
