package com.huangzong.demo11;

public class GoodsTest {
    public static void main(String[] args) {
        //对象数组存储
        //创建一个数组
        Goods[] arr = new Goods[3];
        //创建对象
        Goods g1 = new Goods("001", "华为手机", 5899.0, 100);
        Goods g2 = new Goods("002", "小米手机", 3899.0, 200);
        Goods g3 = new Goods("003", "笔记本", 6899.0, 10);
        //把商品添加到数组中
        arr[0] = g1;
        arr[1] = g2;
        arr[2] = g3;

        //遍历
        for (int i = 0; i < arr.length; i++){
            Goods goods = arr[i];
            System.out.println(goods.getId()  + "," + goods.getName() + "," +goods.getPrice() + "," + goods.getCount());
        }
    }
}
