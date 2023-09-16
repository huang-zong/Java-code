package com.huangzong.iotest;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

public class IoTest05 {
    public static void main(String[] args) throws IOException {
        //文件拷贝
        //统计拷贝时间
        //开始时间
        long startTime = System.currentTimeMillis();

        //创建输入流对象
        FileInputStream fis = new FileInputStream("code01\\a.txt");
        //创建输出流对象
        FileOutputStream fos = new FileOutputStream("code01\\b.txt");
        //拷贝文件，边读边写
        int read;
        while ((read = fis.read()) != -1){
            //输出数据
            fos.write(read);
        }

        //释放资源,先开后关
        fos.close();
        fis.close();

        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
    }
}
