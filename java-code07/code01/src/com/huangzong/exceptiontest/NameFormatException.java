package com.huangzong.exceptiontest;

public class NameFormatException extends RuntimeException{
    //空参构造
    public NameFormatException() {
    }
    //带参构造

    public NameFormatException(String message) {
        super(message);
    }
}
