package com.huangzong.demo5;

public class Test06 {
    public static void main(String[] args) {
        //目标：方法的重载
        //兼容全整数类型，比较两个整数是否相同
        compare((byte)3,(byte)5);
        compare((short)35,(short)57);
        compare(333,534);
        compare(3445l,555224l);
    }
    public static void compare(byte b1, byte b2){
        System.out.println(b1 == b2);
    }
    public static void compare(short b1, short b2){
        System.out.println(b1 == b2);
    }
    public static void compare(int b1, int b2){
        System.out.println(b1 == b2);
    }
    public static void compare(long b1, long b2){
        System.out.println(b1 == b2);
    }
}
