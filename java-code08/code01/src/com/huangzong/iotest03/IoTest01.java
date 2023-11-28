package com.huangzong.iotest03;

import java.io.*;

public class IoTest01 {
    public static void main(String[] args) throws IOException {
        //字节缓冲流
        //创建输入流对象
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("code01\\d.txt"));
        //创建输出流对象
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("code01\\copyd1.txt"));
/*
        //读取数据并拷贝,一次读取一个字节
        int b;
        while ((b = bis.read()) != -1){
            //输出数据
            bos.write(b);
        }*/

        //读取数据并拷贝，一次读取多个字节
        //定义数组存储
        byte[] bytes = new byte[1024];
        int len;
        while ((len = bis.read(bytes)) != -1){
            //输出数据
            bos.write(bytes,0,len);
        }

        //释放资源
        bis.close();
        bos.close();
    }
}
