package com.huangzong.iotest01;

import java.io.FileOutputStream;
import java.io.IOException;

public class IoTest02 {
    public static void main(String[] args) throws IOException {
        //字节输出流写出数据的三种方式
        //创建流对象
        FileOutputStream fos = new FileOutputStream("code01\\a.txt");
        //写出数据
        //方式一
        //fos.write(97);

        //方式二
        byte[] bytes = new byte[]{97, 98, 99, 100};
        //fos.write(bytes);

        //方式三
        fos.write(bytes, 1, 2);
        //释放资源
        fos.close();
    }
}
