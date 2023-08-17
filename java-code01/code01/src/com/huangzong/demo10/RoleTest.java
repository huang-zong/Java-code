package com.huangzong.demo10;

public class RoleTest {
    public static void main(String[] args) {
        //文字格斗游戏
        //定义第一个游戏对象
        Role game1 = new Role("乔峰",100, '男');
        //定义第二个游戏对象
        Role game2 = new Role("鸠摩智",100, '男');
        //角色信息
        game1.showRoleInfo();
        game2.showRoleInfo();
        //轮流攻击对方
        //定义一个变量用于统计回合
        int count = 0;
        //不确定结束条件使用while循环
        while (true){
            //game1攻击game2
            game1.attack(game2);
            if (game2.getBlood() == 0){
                System.out.println(game1.getName() + "K.O了" + game2.getName());
                break;
            }
            //game2攻击game1
            game2.attack(game1);
            if (game1.getBlood() == 0){
                System.out.println(game2.getName() + "K.O了" + game1.getName());
                break;
            }
            count++;
        }
        System.out.println("总共进行了" + count  + "回合");
    }
}
