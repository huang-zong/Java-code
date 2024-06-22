package com.huangzong.iotest04;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class IoTest03 {
    public static void main(String[] args) throws IOException {
        //解压缩流
        //创建一个File对象表示文件输入源
        File src = new File("D:\\javacode\\java-test.zip");
        //创建一个File对象表示文件输出目的地
        File dest = new File("D:\\");
        //调用方法
        unzip(src,dest);
    }

    //定义一个方法解压缩
    public static void unzip(File src, File dest) throws IOException {
        //创建解压缩流对象
        ZipInputStream zis = new ZipInputStream(new FileInputStream(src));
        //定义zipentry变量
        ZipEntry zipEntry;
        //循环获取压缩包里的zipentry对象
        while ((zipEntry = zis.getNextEntry()) != null){
            System.out.println(zipEntry);
            if (zipEntry.isDirectory()){
                //是文件夹则创建同级文件夹
                File file = new File(dest,zipEntry.toString());
                file.mkdirs();
            }else {
                //是文件则复制文件数据
                FileOutputStream fos = new FileOutputStream(new File(dest,zipEntry.toString()));
                byte[] b = new byte[128];
                int len;
                while ((len = zis.read(b)) != -1){
                    //输出数据到目的地
                    fos.write(b,0,len);
                }
                //释放资源
                fos.close();
                //表示压缩包的一个文件处理完毕
                zis.closeEntry();
            }
        }
        //释放资源
        zis.close();
    }
}
