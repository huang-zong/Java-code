package com.huangzong.demo24;

public class PingPangSporter extends Sportet implements SpeakEnglish{

    public PingPangSporter() {
    }

    public PingPangSporter(String name, int age) {
        super(name, age);
    }

    @Override
    public void speakEnglish() {
        System.out.println("说英语");
    }

    @Override
    public void study() {
        System.out.println("学打乒乓球");
    }
}
