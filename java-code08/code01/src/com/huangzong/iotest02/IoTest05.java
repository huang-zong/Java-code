package com.huangzong.iotest02;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IoTest05 {
    public static void main(String[] args) throws IOException {
        //文件加密，解密
        //创建输入流对象
        FileInputStream fis = new FileInputStream("code01\\dency.txt");
        //创建输出流对象
        FileOutputStream fos = new FileOutputStream("code01\\den.txt");
        //文件加密,使用异或进行加密
        int b;
        while ((b = fis.read()) != -1){
            //输出结果
            fos.write(b ^ 10);
        }
        //释放资源
        fos.close();
        fis.close();
    }
}
