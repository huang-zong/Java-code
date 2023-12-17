package com.huangzong.iotest02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class IoTest02 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //反序列化流
        //创建反序列化流对象
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("code02\\c.txt"));

        //输入数据
        Object o = ois.readObject();
        //打印
        System.out.println(o);

        //释放资源
        ois.close();
    }
}
