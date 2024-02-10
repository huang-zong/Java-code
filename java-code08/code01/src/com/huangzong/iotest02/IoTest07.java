package com.huangzong.iotest02;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class IoTest07 {
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
        Integer[] arr = Arrays.stream(sb.toString().split("-"))
                .map(Integer::parseInt)
                .sorted()
                .toArray(Integer[]::new);

        //输出数据
        FileWriter fw = new FileWriter("code01\\eout.txt");
        String newStr = Arrays.toString(arr).replace(", ", "-");
        String result = newStr.substring(1, newStr.length() - 1);
        fw.write(result);

        //释放资源
        fw.close();
    }
}
