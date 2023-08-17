package com.huangzong.demo13;

public class StudentTest {
    public static void main(String[] args) {
        //创建对象数组
        Student[] arr = new Student[3];
        //创建对象
        Student student1 = new Student(001, "zhangsan", 15);
        Student student2 = new Student(002, "xuyuan", 17);
        Student student3 = new Student(003, "baiming", 19);
        //将对象存储到数组
        arr[0] = student1;
        arr[1] = student2;
        arr[2] = student3;

        //1、再次添加一个学生对象，并在添加时进行学号唯一性判断
        Student student4 = new Student(004, "wangwang", 14);
        //学号唯一性判断
        boolean flag = containsId(arr,student4.getId());
        int index = 0;
        if (flag){
            //学号存在
            System.out.println("当前学号已经存在，请修改学号");
        }else{
            //学号不存在添加学生对象
            //对数组元素数量统计
            int count = containsNum(arr);
            if (count == arr.length){
                //数组已经存满
                //创建一个新的数组，将老的数组的元素复制过去
                Student[] newArr = new Student[count+1];
                for (int i = 0; i < arr.length; i++){
                    newArr[i] = arr[i];
                }
                newArr[count] = student4;
                //2、添加完毕后遍历所有学生信息
                print(newArr);
                System.out.println("===========================");
                //3、通过id删除学生信息，id存在则删除，否则提示删除失败
                //id存在判断
                index = getIndex(newArr,5);
                deleteNum(newArr,index);
            }else {
                //数组没有存满
                arr[count] = student4;
                //2、添加完毕后遍历所有学生信息
                print(arr);
                System.out.println("==========================");
                //3、通过id删除学生信息，id存在则删除，否则提示删除失败
                //id存在判断
                index = getIndex(arr,5);
                deleteNum(arr,index);
            }
        }




    }

    //定义一个方法进行学号唯一性判断
    public static boolean containsId(Student[] arr, int id){
        for (int i = 0; i <arr.length; i++){
            Student stu = arr[i];
            if (stu != null){
                if (stu.getId() == id){
                    return true;
                }
            }
        }
        return false;
    }

    //定义一个方法判断数组里的元素个数
    public static int containsNum(Student[] arr){
        //定义一个计数变量
        int count = 0;
        for (int i = 0; i <arr.length; i++){
            Student stu = arr[i];
            if (stu != null){
                count++;
            }
        }
        return count;
    }

    //定义一个方法用于遍历数组
    public static void print(Student[] arr){
        for (int i = 0; i < arr.length; i ++){
            Student stu = arr[i];
            System.out.println(stu.getId() + "," + stu.getName() + "," + stu.getAge());
        }
    }

    //定义一个方法用于id存在判断
    public static int getIndex(Student[] arr,int id){
        for (int i = 0; i < arr.length; i++){
            //非空判断
            Student stu = arr[i];
            if (stu != null){
                if (stu.getId() == id){
                    return i;
                }
            }
        }
        return -1;
    }

    //定义一个方法进行删除并打印

    public static void deleteNum(Student[] arr, int index){
        if (index >= 0){
            arr[index] = null;
            print(arr);
        }else {
            System.out.println("id不存在，删除失败");
        }

    }
}
