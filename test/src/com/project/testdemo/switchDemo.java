package com.project.testdemo;

import java.util.Scanner;

public class switchDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入:");
        int option = sc.nextInt();

        switch (option) {
            case 1 -> System.out.println("机票查询");
            case 2 -> System.out.println("机票退订");
            case 3 -> System.out.println("机票改签");
//            case 4 -> System.out.println("退出服务");
            default -> System.out.println("退出服务");
        }
    }
}
