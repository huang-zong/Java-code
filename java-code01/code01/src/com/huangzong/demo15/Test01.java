package com.huangzong.demo15;

public class Test01 {
    public static void main(String[] args) {
        //敏感词替换
        //获取说到的话
        String talk = "你收到的整数建瓯打扫房间哦，TMD";
        //敏感词替换
        String[] arr = new String[]{"TMD","NMD"};
        for (int i = 0; i <arr.length; i++){
            talk = talk.replace(arr[i],"***");
        }
        //输出结果
        System.out.println(talk);
    }
}
