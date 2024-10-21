package com.project.demo;

import java.util.Scanner;

public class ifStatementDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
//        boolean bool = sc.nextBoolean();
//        if (number > 2) {
//            System.out.println(true);
//        }
//        // price
//        if (bool) {
//            System.out.println("Hello");
//        } else {
//            System.out.println("World");
//        }

        if (number >= 1 && number <= 5) {
            System.out.println("工作日");
        } else if (number > 5 && number <= 7){
            System.out.println("休息日");
        } else {
            System.out.println("没有这个日子");
        }
    }
}

