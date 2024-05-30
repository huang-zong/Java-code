package com.huangzong.iotest04;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class IoTest02 {
    public static void main(String[] args) throws IOException {
        //字符打印流
        //创建字符打印流对象
        PrintWriter pw = new PrintWriter(new FileWriter("code02\\f.txt"),true);

        //输出数据
        pw.println("zhangsan");

        //释放资源
        pw.close();
    }
}
