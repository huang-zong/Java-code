package com.huangzong.demo15;

public class Test02 {
    public static void main(String[] args) {
        //StringBuilder使用
        //创建对象
        StringBuilder sb = new StringBuilder("abc");

        //添加元素
        sb.append(1);
        sb.append(3.4);
        sb.append("ef");
        sb.append(9);


        //反转
        sb.reverse();
        System.out.println(sb);
        //获取长度
        int len = sb.length();
        System.out.println(len);

        //把StringBuilder变回字符串
        String str = sb.toString();
        System.out.println(str);
    }

}
