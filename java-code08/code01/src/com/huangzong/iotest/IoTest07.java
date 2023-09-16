package com.huangzong.iotest;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IoTest07 {
    public static void main(String[] args) throws IOException {
        //一次拷贝多个字节数据
        //统计拷贝时间
        //开始时间
        long startTime = System.currentTimeMillis();

        //创建写入流对象
        FileInputStream fis = new FileInputStream("code01\\a.txt");
        //创建输出流对象
        FileOutputStream fos = new FileOutputStream("code01\\c.txt");
        //拷贝数据，边读边写
        //定义数组存储数据
        byte[] bytes = new byte[10];
        int len;
        while ((len = fis.read(bytes)) != -1){
            //输出数据
            fos.write(bytes , 0 , len);
        }

        //释放资源，先开后方
        fos.close();
        fis.close();

        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
    }
}
