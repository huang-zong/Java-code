package com.huangzong.demo10;

import java.util.Random;

public class Role {
    //成员变量
    private String name;
    private  int blood;
    private  char gender;
    private  String face;//长相是随机的

    //定义长相的数组
    String[] boyFace = new String[]{"好看" , "一般" , " 难看"};
    String[] girlFace = new String[]{"hao" , "yi" , "bu"};

    //定义数组存储攻击描述
    String[] attack_desc = new String[]{"%s打了%s一下","%s狠狠的打了%s一下","%s用力的打了%s"};
    //定义数组存储受伤描述
    String[] injureds_desc = new String[]{"%s受伤","%s快不行了","%s死了"};


    //空参
    public Role(){}
    //带参构造
    public  Role(String name, int blood, char gender){
        this.name = name;
        this.blood = blood;
        this.gender = gender;
        setFace(gender);

    }

    //set和get
    public void setName(String name){
        this.name = name;
    }
    public  String getName(){
        return name;
    }
    public void setBlood(int blood){
        this.blood = blood;
    }
    public int getBlood(){
        return blood;
    }
    public void setGender(char gender){
        this.gender = gender;
    }
    public char getGender(){
        return gender;
    }
    public  void setFace(char gender){
        //相貌是随机的
        Random r = new Random();
        //判断性别
        if (gender == '男'){
            int index = r.nextInt(boyFace.length);
            this.face = boyFace[index];
        }else if (gender == '女'){
            int index = r.nextInt(girlFace.length);
            this.face = girlFace[index];
        }else {
            this.face = "就这样吧";
        }
    }
    public String getFace(){
        return  face;
    }

    //成员方法
    public void attack(Role role){
        //攻击描述
        Random r = new Random();
        int index = r.nextInt(attack_desc.length);
        System.out.printf(attack_desc[index],this.getName(),role.getName());
        System.out.println();
        //随机生成伤害1~20
        int hurt = r.nextInt(20) + 1;
        //计算剩余血量
        int remainBlood = role.getBlood() - hurt;
        //如果剩余血量为负数，就修改为0
        remainBlood = remainBlood < 0 ? 0 : remainBlood;
        //修改挨揍的人的血量
        role.setBlood(remainBlood);

        //方法调用者攻击了形参,this表示方法的调用者
        if (remainBlood > 90){
            System.out.printf(injureds_desc[0],role.getName());
        }else if (remainBlood > 50 && remainBlood <=90){
            System.out.printf(injureds_desc[1],role.getName());
        }else {
            System.out.printf(injureds_desc[2],role.getName());
        }
        System.out.println();
    }

    //成员行为输出角色信息
    public void showRoleInfo(){
        System.out.println("姓名为：" + getName());
        System.out.println("血量为：" + getBlood());
        System.out.println("性别为：" + getGender());
        System.out.println("外貌为：" + getFace());
    }
}
