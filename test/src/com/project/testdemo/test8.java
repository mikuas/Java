package com.project.testdemo;

import java.util.Random;

public class test8 {
    public static void main(String[] args) {
//        int[] arr = {33, 5, 22, 44, 55};
//        int max = arr[0];
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > max) {
//                max = arr[i];
//            }
//        }
//        System.out.println(max);
        Random random = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10, 101);
        }

        int sum = 0, average = 0, min = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        average = sum / arr.length;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < average) {
                min++;
            }
        }

        System.out.println("和等于 " + sum + ", 平均数等于 " + average + ", 比平均值小的有 " + min + " 个");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
