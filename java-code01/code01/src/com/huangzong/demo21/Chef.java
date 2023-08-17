package com.huangzong.demo21;

public class Chef extends Employee{
    public Chef() {
    }

    public Chef(String id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        System.out.println("炒菜");
    }
}
