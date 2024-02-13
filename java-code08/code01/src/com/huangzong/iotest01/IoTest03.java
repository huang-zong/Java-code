package com.huangzong.iotest01;

import java.io.FileOutputStream;
import java.io.IOException;

public class IoTest03 {
    public static void main(String[] args) throws IOException {
        //续写，换行
        //创建对象,打开续写开关
        FileOutputStream fos = new FileOutputStream("code01\\a.txt",true);
        //换行输出\r\n
        String str = "hello world\r\n";
        //获取字节码
        byte[] bytes = str.getBytes();
        //输出
        fos.write(bytes);

        String str2 = "java\r\n";
        //获取字节码
        byte[] bytes2 = str2.getBytes();
        //输出
        fos.write(bytes2);

        //释放资源
        fos.close();
    }
}
