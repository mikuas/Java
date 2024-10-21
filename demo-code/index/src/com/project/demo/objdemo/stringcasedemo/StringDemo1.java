package com.project.demo.objdemo.stringcasedemo;

import java.util.Random;
import java.util.Scanner;

public class StringDemo1 {
    public static void main(String[] args) {
        /*
        随机打乱输入的字符串
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串: ");
        String str = sc.next();
        System.out.println(reset(str));
    }

    public static String reset(String str) {
        char[] arr = str.toCharArray();
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            char c = arr[i];
            int randomIndex = random.nextInt(arr.length);
            arr[i] = arr[randomIndex];
            arr[randomIndex] = c;
        }
        return String.valueOf(arr);
    }
}
