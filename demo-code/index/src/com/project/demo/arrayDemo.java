package com.project.demo;

public class arrayDemo {
    public static void main(String[] args) {
//        int [] array = new int[]{1, 2, 3};
//        int [] array1 = {1, 2, 3};
//
//        System.out.println(array); // [I@4eec7777
        // [: 表示当前是一个数组
        // I: 表示里面的元素都是int类型的
        // @: 间隔符号 (固定格式)
        // 4eec7777: 正真的数组地址值 16进制

        String[] arr = new String[50];

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
