package com.huangzong.searchtest;

public class BlockSearchTest {
    public static void main(String[] args) {
        //使用分块查找，查找数组中的某个元素的索引
        //定义一个数组
        int[] arr = new int[]{27,22,30,40,36,
                13,19,16,20,
                7,10,
                43,50,48};

        //创建四个块对象
        Block block1 = new Block(22 , 40 , 0 ,4);
        Block block2 = new Block(13 , 20 , 5 ,8);
        Block block3 = new Block(7 , 10 , 9 ,10);
        Block block4 = new Block(43 , 50 , 11 ,13);

        //定义数组用来管理四个块的对象（索引表)
        Block[] blocksArr = new Block[]{block1,block2,block3,block4};
        //定义变量记录要查找的元素
        int number = 31;
        //调用方法查找数据，传递数组，索引表，要查找元素
        int index = getIndex(blocksArr, arr, number);
        //打印
        System.out.println(index);
    }

    //定义方法使用分块查找原理查找数据
    private static int getIndex(Block[] blocksArr, int[] arr, int number) {
        //调用方法确定数据在哪个块中
        int indexBlock = getIndexBlock(blocksArr, number);
        if (indexBlock == -1){
            System.out.println("数据不存在");
            return -1;
        }
        //获取起始索引
        int startIndex = blocksArr[indexBlock].getStartIndex();
        //获取结束索引
        int endIndex = blocksArr[indexBlock].getEndIndex();
        //循环遍历
        for (int i = startIndex; i < endIndex; i++){
            if (number == arr[i]){
                return i;
            }
        }
        return -1;
    }

    private static int getIndexBlock(Block[] blocksArr, int number) {
        //遍历索引表查找
        for (int i = 0; i < blocksArr.length; i++){
            if (number > blocksArr[i].getMin() && number < blocksArr[i].getMax()){
                //数据在数组中
                return i;
            }
        }
        return -1;
    }
}
