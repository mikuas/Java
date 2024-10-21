package com.project.demo;
import java.util.Scanner;

public class switchStatementDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        switch (a) {
            case 1:
                System.out.println(1);
                break;
            case 2:
                System.out.println(2);
                break;
            default:
                System.out.println("Default");
                break;
        }

        switch (a) {
            case 1 -> {

            }
            case 2 -> {

            }
            default -> {
                break;
            }
        }

        int week = sc.nextInt();
        switch (week) {
            case 1, 2, 3, 4 ,5 -> System.out.println("工作日");
            case 6, 7 -> System.out.println("休息日");
            default -> System.out.println("没有这个日子");
        }
    }
}
