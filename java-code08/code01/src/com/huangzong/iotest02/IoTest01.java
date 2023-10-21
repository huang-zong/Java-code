package com.huangzong.iotest02;

import java.io.FileReader;
import java.io.IOException;

public class IoTest01 {
    public static void main(String[] args) throws IOException {
        //字符输入流
        //创建输入流对象
        FileReader fr = new FileReader("code01\\d.txt");
        //空参读取数据
        int ch;
        while ((ch = fr.read()) != -1){
            System.out.print((char) ch);
        }

        //释放资源
        fr.close();
    }
}
