package com.huangzong.demo16;

public class Phone {
    //成员变量
    private String brand;
    private  int price;
    //空参构造
    public Phone(){}
    //带参构造
    public Phone(String brand, int price){
        this.brand = brand;
        this.price = price;
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
}
