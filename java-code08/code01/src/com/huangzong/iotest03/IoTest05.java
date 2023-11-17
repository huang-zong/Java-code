package com.huangzong.iotest03;

import java.io.*;

public class IoTest05 {
    public static void main(String[] args) throws IOException {
        //控制软件使用次数
        //创建输入流对象
        BufferedReader br = new BufferedReader(new FileReader("code01\\f.txt"));
        //读取数据
        String line = br.readLine();
        //释放资源
        br.close();

        //转换为整数
        int count = Integer.parseInt(line);
        //自增
        count++;
        //判断
        if (count <= 3){
            System.out.println("第" + count + "次使用");
        }else {
            System.out.println("只能使用三次");
        }

        //输出结果
        //创建输出流对象
        BufferedWriter bw = new BufferedWriter(new FileWriter("code01\\f.txt"));
        //输出数据
        bw.write(count + "");
        //释放资源
        bw.close();
    }
}
