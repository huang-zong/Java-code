package com.huangzong.iotest02;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class IoTest06 {
    public static void main(String[] args) throws IOException {
        //文本文件中的数据进行排序
        //创建字符输入流对象
        FileReader fr = new FileReader("code01\\e.txt");
        //读取数据
        StringBuilder sb = new StringBuilder();
        int read;
        while ((read = fr.read()) != -1){
            sb.append((char) read);
        }
        //释放资源
        fr.close();

        //排序
        //转换为字符串
        String string = sb.toString();
        //切割字符串
        String[] arrStr = string.split("-");
        //创建集合存储
        ArrayList<Integer> list = new ArrayList<>();
        //转换为整数
        for (int i = 0; i < arrStr.length; i++) {
           list.add(Integer.parseInt(arrStr[i]));
        }
        //默认排序
        Collections.sort(list);

        //输出数据
        //创建字符输出流对象
        FileWriter fw = new FileWriter("code01\\eout.txt");
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() -1){
                fw.write(list.get(i) + "");
            }else {
                fw.write(list.get(i) + "-");
            }
        }

        //释放资源
        fw.close();

    }
}
