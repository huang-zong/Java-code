package com.huangzong.iotest;

import java.io.FileInputStream;
import java.io.IOException;

public class IoTest06 {
    public static void main(String[] args) throws IOException {
        //一次读取多个数据
        //创建写入流对象
        FileInputStream fis = new FileInputStream("code01\\a.txt");
        //读取数据
        //定义数组存储数据
        byte[] bytes = new byte[2];
        int len;
        while ((len = fis.read(bytes)) != -1) {
            //转换为字符打印
            System.out.print(new String(bytes, 0, len));
        }

        //释放资源
        fis.close();
    }
}
