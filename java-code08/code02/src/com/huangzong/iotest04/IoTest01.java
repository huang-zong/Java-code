package com.huangzong.iotest04;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.nio.charset.Charset;

public class IoTest01 {
    public static void main(String[] args) throws FileNotFoundException {
        //字节打印流
        //创建字节打印流对象
        PrintStream ps = new PrintStream(new FileOutputStream("code02\\e.txt",true),true, Charset.forName("UTF-8"));

        //输出数据
        ps.println(97);

        //释放资源
        ps.close();
    }
}
