package com.project.testdemo;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        /*
            需求: 给定两个整数, 被除数和除数 都是正数
            将两数相除, 要求不适用乘法,除法和 % 运算符
            得到商和余数
         */
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt(), number2 = sc.nextInt(), count = 0;
        // 商 = number1 除以 number2
        // 余数 = number1 余以 number2
        System.out.println("商 = " + number1 / number2 + " 余数 = " + number1 % number2);
        System.out.println("------------------------------------");
        while (number1 >= number2) {
            // 商
            count++;
            // 余数
            number1 -= number2;
        }
        System.out.println("商 = " + count);
        System.out.println("余数 = " + number1);
        // dividend divisor
    }
}
