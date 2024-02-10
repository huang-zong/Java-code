package com.huangzong.iotest02;

import java.io.FileWriter;
import java.io.IOException;

public class IoTest03 {
    public static void main(String[] args) throws IOException {
        //字符输出流
        //创建输出流对象
        FileWriter fw = new FileWriter("code01\\e.txt", true);
        //输出一个字符
        //fw.write(97);

        //输出一个字符串
        //fw.write("你好呀。");

        //输出一个字符数组
        char[] chars = new char[]{'我','是','谁'};
        fw.write(chars);
        //释放资源
        fw.close();
    }
}
