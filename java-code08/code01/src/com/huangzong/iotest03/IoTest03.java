package com.huangzong.iotest03;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class IoTest03 {
    public static void main(String[] args) throws IOException {
        //恢复出师表的顺序
        //创建输入流对象
        BufferedReader br = new BufferedReader(new FileReader("code01\\csb.txt"));

        //读取数据
        //定义集合存储
        ArrayList<String> list = new ArrayList<>();
        String line;
        while ((line = br.readLine()) != null){
            list.add(line);
        }

        //释放资源
        br.close();

        //排序
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int i1 = Integer.parseInt(o1.split("\\.")[0]);
                int i2 = Integer.parseInt(o2.split("\\.")[0]);
                return i1 - i2;
            }
        });

        //输出数据
        //创建输出流对象
        BufferedWriter bw = new BufferedWriter(new FileWriter("code01\\csbcopy.txt"));
        for (String str : list) {
            bw.write(str);
            bw.newLine();
        }

        //释放资源
        bw.close();
    }
}
