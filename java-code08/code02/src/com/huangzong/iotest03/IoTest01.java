package com.huangzong.iotest03;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class IoTest01 {
    public static void main(String[] args) throws IOException {
        //序列化流
        //创建对象
        Student sut1 = new Student("zhangsan",14);
        Student sut2 = new Student("lisi",24);
        Student sut3 = new Student("wangwu",34);

        //创建集合并添加元素
        ArrayList<Student> list = new ArrayList<>();
        Collections.addAll(list,sut1,sut2,sut3);

        //创建序列化流输出对象
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("code02\\d.txt"));

        //输入数据
        oos.writeObject(list);

        //释放资源
        oos.close();
    }
}
