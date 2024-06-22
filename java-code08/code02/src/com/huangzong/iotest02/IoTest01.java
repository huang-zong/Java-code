package com.huangzong.iotest02;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class IoTest01 {
    public static void main(String[] args) throws IOException {
        //序列化流
        //创建对象
        Student stu = new Student("zhangsna", 13);

        //创建序列化流输出对象
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("code02\\c.txt"));

        //输出数据
        oos.writeObject(stu);

        //释放资源
        oos.close();
    }
}
