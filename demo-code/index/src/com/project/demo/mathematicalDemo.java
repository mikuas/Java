package com.project.demo;

import java.util.Scanner;

public class mathematicalDemo {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println(b-=a);
        System.out.println(a+=b);
        // +=, -=, *=, /=, %=底层都隐藏了一个强制类型转换
        char ts = 'a';
        ts++;
        System.out.println(ts);

        Scanner sc = new Scanner(System.in);
        int one = sc.nextInt();
        int two = sc.nextInt();
        System.out.println(one > two);
    }
}

