package com.huangzong.iotest01;

import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;

public class IoTest01 {
    public static void main(String[] args) throws IOException {
        //指定字符编码读取数据
        //创建对象并指定字符编码
        FileReader fr = new FileReader("code02\\a.txt", Charset.forName("GBK"));
        //读取数据
        int ch;
        while ((ch = fr.read()) != -1){
            System.out.print((char) ch);
        }
        //释放资源
        fr.close();
    }
}
