package com.huangzong.iotest03;

import java.io.*;

public class IoTest02 {
    public static void main(String[] args) throws IOException {
        //字符缓冲流
        //创建输入流对象
        BufferedReader br = new BufferedReader(new FileReader("code01\\d.txt"));
        //创建输出流对象
        BufferedWriter bw = new BufferedWriter(new FileWriter("code01\\copyd2.txt"));

        //拷贝数据
        String line;
        while ((line = br.readLine()) != null){
            //输出数据
            bw.write(line);
            //换行
            bw.newLine();
        }

        //释放资源
        br.close();
        bw.close();
    }
}
