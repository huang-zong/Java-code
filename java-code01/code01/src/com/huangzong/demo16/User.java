package com.huangzong.demo16;

public class User {
    //成员变量
    private String id;
    private String username;
    private int password;
    //空参构造
    public User(){}
    //带参构造
    public User(String id, String username, int password){
        this.id = id;
        this.username = username;
        this.password = password;
    }
    //get和set
    public void setId(String id){
        this.id = id;
    }
    public String getId(){
        return id;
    }
    public void setUsername(String username){
        this.username = username;
    }
    public String getUsername(){
        return username;
    }
    public void setPassword(int password){
        this.password = password;
    }
    public int getPassword(){
        return password;
    }
}
