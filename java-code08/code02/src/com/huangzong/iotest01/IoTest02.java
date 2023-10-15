package com.huangzong.iotest01;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;

public class IoTest02 {
    public static void main(String[] args) throws IOException {
        //将本地文件的GBK文件，转换城UTF-8
        //创建输入流对象
        FileReader fr = new FileReader("code02\\a.txt" , Charset.forName("GBK"));
        //创建输出流对象
        FileWriter fw = new FileWriter("code02\\b.txt" ,Charset.forName("UTF-8"));
        //转换数据
        int b;
        while ((b = fr.read()) != -1){
            //输出数据
            fw.write(b);
        }
        //释放资源
        fw.close();
        fr.close();
    }
}
