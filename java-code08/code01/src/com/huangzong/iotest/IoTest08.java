package com.huangzong.iotest;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class IoTest08 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        //字符集编码，解码
        //默认编码
        String str = "ai你啊";
        byte[] bytes = str.getBytes();
        System.out.println(Arrays.toString(bytes));
        //默认解码
        System.out.println(new String(bytes));

        //自定义编码
        byte[] bytes1 = str.getBytes("GBK");
        System.out.println(Arrays.toString(bytes1));
        //自定义解码
        System.out.println(new String(bytes1, "GBK"));
    }
}
