package com.huangzong.filetest02;

import java.io.File;
import java.io.IOException;

public class FileTest01 {
    public static void main(String[] args) throws IOException {
        //在当前模块下的aaa文件夹中创建一个a.txt文件
        //创建父级路径
        File file = new File("code01\\aaa");
        //创建父级路径
        file.mkdirs();
        //拼接父级路径和子级路径
        File file1 = new File(file , "a.txt");
        boolean newFile = file1.createNewFile();
        if (newFile){
            System.out.println("创建成功");
        }else {
            System.out.println("创建失败");
        }
    }
}
