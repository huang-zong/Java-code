package com.huangzong.iotest01;

import java.io.FileInputStream;
import java.io.IOException;

public class IoTest04 {
    public static void main(String[] args) throws IOException {
        //读取数据
        //创建流对象
        FileInputStream fis = new FileInputStream("code01\\a.txt");
       /* //读取数据
        int read = fis.read();
        System.out.println((char) read);*/

        //循环读取
        int read;
        while ((read = fis.read()) != -1){
            System.out.print((char) read);
        }
        //释放资源
        fis.close();
    }
}
