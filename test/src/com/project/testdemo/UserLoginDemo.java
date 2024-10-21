package com.project.testdemo;

import java.util.Scanner;

public class UserLoginDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter your username: ");
            String uName = sc.next();
            System.out.println("Enter your password: ");
            String uPass = sc.next();
            if (uName.equals("miku") && uPass.equals("114514")) {
                System.out.println("登录成功");
                break;
            } else {
                if ((2 - i) == 0) {
                    System.out.println("登录失败,已锁定");
                    break;
                }
                System.out.println("登录失败,还有" + (2 - i) + "次机会");
            }
        }
    }
}
