package com.project.testdemo;

import java.util.Scanner;

public class traversalStringDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串: ");
        String result = sc.next();

        for (int i = 0; i < result.length(); i++) {
            System.out.println(result.charAt(i));
        }
    }
}
