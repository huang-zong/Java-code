package com.huangzong.mathtest;

public class Test02 {
    public static void main(String[] args) {
        //自己实现parseInt方法的效果，将字符串形式的数据转换为整数
        //要求：字符串只能是数字不能有其他字符，最少一位，最多10位，0不能开头
        //定义一个字符串
        String str = "1232434";
        //校验字符
        if (!str.matches("[1-9]\\d{0,9}")){
            System.out.println("数据格式有误");
        }else {
            System.out.println("数据格式正常");
            //定义变量存储结果
            int num = 0;
            //遍历字符串
            for (int i = 0; i < str.length(); i++){
                char ch = str.charAt(i);
                //字符’1‘ - ‘0’可得到数字1
                ch -= '0';
                num = num * 10 + ch;
            }
            //输出结果
            System.out.println(num);
        }
    }
}
