package com.huangzong.demo12;

import java.util.Objects;

public class Car {
    //成员变量
    private String brand;
    private int price;
    private String color;
    //空参构造
    public Car(){}
    //带参构造
    public Car(String brand, int price, String color){
        this.brand = brand;
        this.price = price;
        this.color = color;
    }
    //get和set
    public void setBrand(String brand){
        this.brand = brand;
    }
    public String getBrand(){
        return brand;
    }
    public void setPrice(int price){
        this.price = price;
    }
    public int getPrice(){
        return price;
    }
    public void setColor(String color){
        this.color = color;
    }
    public String getColor(){
        return color;
    }
}
