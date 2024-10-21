package com.project.demo;

import java.util.Scanner;

public class forDemo {
    public static void main(String[] args) {
        /*for (int i = 1; i <= 10; i++) {
            System.out.println("Hello World");
        }

        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        for (int i = 5; i >= 1; i--) {
            System.out.println(i);
        }*/
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            sum += i;
        }
        System.out.println(sum);

        int evenSum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                evenSum += i;
            }
        }
        System.out.println(evenSum);

        Scanner sc = new Scanner(System.in);
        System.out.println("统计范围内能被三整数且能被五整除的数个个数");
        System.out.println("开始:");
        int start = sc.nextInt();
        System.out.println("结束:");
        int end = sc.nextInt();
        sum = 0;

        for (int i = start; i <= end; i++) {
            if (i % 3 == 0 && i % 5 ==0) {
                sum += 1;
            }
        }
        System.out.println(sum + "个");
    }
}
