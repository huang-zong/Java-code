package com.huangzong.filetest02;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FileTest06 {
    public static void main(String[] args) {
        //统计文件夹中每种文件的个数并打印
        //创建对象
        File file = new File("D:\\javacode");
        System.out.println(getCount(file));
    }

    //定义方法统计个数
    public static HashMap<String, Integer> getCount(File file) {
        //创建集合存储
        HashMap<String, Integer> hm = new HashMap<>();
        //进入文件夹
        File[] files = file.listFiles();
        //遍历文件
        for (File file1 : files) {
            //判断是否文件
            if (file1.isFile()) {
                //获取文件名
                String name = file1.getName();
                //切割文件名
                String[] split = name.split("\\.");
                //对于空文件无后缀名的排除
                if (split.length >= 2) {
                    //获取后缀名
                    String key = split[split.length - 1];
                    if (hm.containsKey(key)) {
                        //集合中存在则累加
                        //获取值
                        int count = hm.get(key);
                        count++;
                        //更新集合
                        hm.put(key, count);
                    } else {
                        //不存在
                        hm.put(key, 1);
                    }
                }
            } else {
                //当前是文件夹则递归调用
                HashMap<String, Integer> childHm = getCount(file1);
                //统计
                //获取键值对对象
                Set<Map.Entry<String, Integer>> entries = childHm.entrySet();
                //遍历
                for (Map.Entry<String, Integer> entry : entries) {
                    //获取键
                    String key = entry.getKey();
                    //获取值
                    Integer value = entry.getValue();
                    //集合中是否存在
                    if (hm.containsKey(key)) {
                        //存在则累加
                        //获取值
                        int count = hm.get(key);
                        count += value;
                        //更新集合
                        hm.put(key, count);
                    } else {
                        //不存在则更新
                        hm.put(key, value);
                    }
                }
            }
        }
        return hm;
    }
}
