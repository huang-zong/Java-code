package com.huangzong.iotest03;

import java.io.*;
import java.util.Set;
import java.util.TreeMap;

public class IoTest04 {
    public static void main(String[] args) throws IOException {
        //恢复出师表顺序
        //创建输入流对象
        BufferedReader br = new BufferedReader(new FileReader("code01\\csb.txt"));

        //读取数据
        //创建集合存储
        TreeMap<Integer ,String> tm = new TreeMap<>();
        String line;
        while ((line = br.readLine()) != null){
            int key = Integer.parseInt(line.split("\\.")[0]);
            //存入集合
            tm.put(key , line);
        }

        //释放资源
        br.close();

        //输出数据
        //创建输出流对象
        BufferedWriter bw = new BufferedWriter(new FileWriter("code01\\csbcopy1.txt"));
        //获取所有键
        Set<Integer> keys = tm.keySet();
        for (Integer key : keys) {
            //获取值
            String value = tm.get(key);
            //输出
            bw.write(value);
            bw.newLine();
        }

        //释放资源
        bw.close();
    }
}
