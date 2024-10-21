package com.project.demo;

import java.util.Scanner;


public class KeyboardInputDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
//        int num2 = sc.nextInt();
        System.out.println(num1 % 10); // 个位 数值 % 10
        System.out.println(num1 / 10 % 10);// 十位 数值 / 10 % 10
        System.out.println(num1 / 100 % 10);// 百位 数值 / 100 % 10
    }
}

