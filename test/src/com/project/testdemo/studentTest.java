package com.project.testdemo;

import java.util.Scanner;

public class studentTest {
    public static void main(String[] args) {
        // 创建长度为3的数组
        Student[] arr = new Student[3];
        // 添加一个默认值
        arr[0] = new Student("0d000721", "LinDiNN", 18);
        Scanner sc = new Scanner(System.in);

        String[] idArr = new String[arr.length];
        // 把id存入数组
        idArr[0] = arr[0].getId();
        // 键盘录入数据
        for (int i = 1; i < arr.length; ) {
            arr[i] = new Student();
            System.out.println("请输入id:");
            String id = sc.next();
            // 判断是否存在
            if (contains(idArr, id)) {
                idArr[i] = id;
                arr[i].setId(id);
                System.out.println("请输入姓名:");
                arr[i].setName(sc.next());
                System.out.println("请输入年龄:");
                arr[i].setAge(sc.nextInt());
                i++;
            }
        }
        System.out.println("--------------------");
        printArrayElement(arr);
        System.out.println("--------------------");
        deleteTheArrayById(arr, "1145");
        System.out.println("--------------------");
        printArrayElement(arr);
        System.out.println("--------------------");
        getAgeById(arr);
        System.out.println("--------------------");
        printArrayElement(arr);
    }

    public static boolean contains(String[] array, String id) {
        for (String value : array) {
            // 判断输入的id是否唯一
            if (id.equals(value)) {
                System.out.println("id不唯一,请重新输入:");
                // 不唯一重新输入
                return false;
            }
        }
        return true;
    }

    // 判断id是否存在 存在删除
    public static void deleteTheArrayById(Student[] array, String id) {
        boolean flag = true;
        for (Student student : array) {
            if (student.getId() != null && student.getId().equals(id)) {
                student.setId(null).setAge(0).setName(null);
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("id不存在");
        }
    }

    public static void printArrayElement(Student[] array) {
        for (Student student : array) {
            System.out.printf(student.getId() + " ");
            System.out.printf(student.getName() + " ");
            System.out.print(student.getAge());
            System.out.println();
        }
    }

    public static void getAgeById(Student[] array) {
        for (Student student : array) {
            if (student.getId() != null) {
                if (student.getId().equals("heima1145")) {
                    student.setAge(student.getAge() + 1);
                    break;
                }
            }
        }
    }
}
