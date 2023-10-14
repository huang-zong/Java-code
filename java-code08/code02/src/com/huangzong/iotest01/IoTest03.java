package com.huangzong.iotest01;

import java.io.*;

public class IoTest03 {
    public static void main(String[] args) throws IOException {
        //利用字节流读取文件中的数据，一次读取一整行，且不能乱码
        //创建输入流对象
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("code02\\b.txt")));
        //读取数据
        String line;
        while ((line = br.readLine()) != null){
            System.out.println(line);
        }
        //释放资源
        br.close();
    }
}
