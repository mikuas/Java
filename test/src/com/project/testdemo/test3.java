package com.project.testdemo;

import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        /*
            逢七过
            从任意一个数字开始报数,当要报的数字是包含7或者是7的倍数 输出 过
         */
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 100; i++) {
            if (i % 10 == 7 || i / 10 % 10 == 7 || i % 7 == 0) {
                System.out.println("过");
            } else {
                System.out.println(i);
            }
        }
    }
}
