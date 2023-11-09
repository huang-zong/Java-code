package com.huangzong.iotest03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class IoTest02 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //反序列化流
        //创建反序列化流输入对象
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("code02\\d.txt"));

        //输入数据
        ArrayList<Student> list =(ArrayList<Student>) ois.readObject();

        //打印
        for (Student student : list) {
            System.out.println(student);
        }

        //释放资源
        ois.close();
    }
}
