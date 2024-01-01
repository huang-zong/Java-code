package com.huangzong.iotest02;

import java.io.FileReader;
import java.io.IOException;

public class IoTest02 {
    public static void main(String[] args) throws IOException {
        //字符输入流
        //创建输入流对象
        FileReader fr = new FileReader("code01\\d.txt");
        //带参读取数据
        char[] ch = new char[2];
        int len;
        while ((len = fr.read(ch)) != -1) {
            System.out.print(new String(ch, 0, len));
        }
        //释放资源
        fr.close();

    }
}
