package com.huangzong.filetest02;

import java.io.File;

public class FileTest03 {
    public static void main(String[] args) {
        //找到电脑中所有以avi结尾的文件（需要考虑子文件夹)
        //调用方法
        getDir();
    }

    //定义方法获取所欲盘符
    public static void getDir(){
        //获取本地所有盘符
        File[] files = File.listRoots();
        for (File file : files) {
            findTxt(file);
        }
    }

    //定义方法查找所有txt结尾的文件
    public static void findTxt(File file){
        //进入文件夹
        File[] files = file.listFiles();
        //files可能为null
        if (files != null){
            //查找文件
            for (File file1 : files) {
                //当前是文件
                if (file1.isFile()){
                    //获取路径名
                    String name = file1.getName();
                    if (name.endsWith(".avi")){
                        System.out.println(name);
                    }else {
                        System.out.println("不存在");
                    }
                }else {
                    //当前是文件夹则递归调用
                    findTxt(file1);
                }
            }
        }
    }
}
