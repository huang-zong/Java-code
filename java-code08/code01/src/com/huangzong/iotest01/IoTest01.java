package com.huangzong.iotest01;

import java.io.FileOutputStream;
import java.io.IOException;

public class IoTest01 {
    public static void main(String[] args) throws IOException {
        //字节输出
        //创建对象
        FileOutputStream fos = new FileOutputStream("code01\\a.txt");
        //输出数据
        fos.write(97);
        //关闭通道
        fos.close();
    }
}
