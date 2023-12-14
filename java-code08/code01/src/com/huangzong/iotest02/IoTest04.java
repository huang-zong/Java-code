package com.huangzong.iotest02;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IoTest04 {
    public static void main(String[] args) throws IOException {
        //拷贝文件夹，考虑子文件夹
        //创建对象表示数据源
        File from = new File("D:\\javacode\\image");
        //创建对象表示目的地
        File to = new File("D:\\javacode\\copy");

        //统计拷贝时间
        long start = System.currentTimeMillis();
        //调用方法
        copyDir(from, to);
        long end = System.currentTimeMillis();
        System.out.println(end - start);

    }

    //定义方法拷贝文件夹
    public static void copyDir(File from, File to) throws IOException {
        //创建目录
        to.mkdirs();
        //进入文件夹
        File[] files = from.listFiles();
        //遍历文件夹
        for (File file : files) {
            //判断是否文件
            if (file.isFile()) {
                //是文件则复制
                //创建文件输入流对象
                FileInputStream fis = new FileInputStream(file);
                //创建文件输出流对象
                FileOutputStream fos = new FileOutputStream(new File(to, file.getName()));
                //拷贝文件
                //定义数组存储
                byte[] bytes = new byte[1024];
                int len;
                while ((len = fis.read(bytes)) != -1) {
                    //输出数据
                    fos.write(bytes, 0, len);
                }
                //释放资源
                fos.close();
                fis.close();
            } else {
                //是文件夹则递归调用
                copyDir(file, new File(to, file.getName()));
            }
        }
    }
}
