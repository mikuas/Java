package com.project.demo;

import java.util.Scanner;

public class logicDemo {
    public static void main(String[] args) {
        // & 逻辑与
        System.out.println(true & true);
        System.out.println(true & false);
        System.out.println(false & false);
        // | 逻辑或
        System.out.println(true | false);
        // 逻辑非
        System.out.println(!true);

        System.out.println("------------------");

        // ^ 异或
        // 相同为false,不同为true
        System.out.println(true ^ false);
        System.out.println(false ^ false);
        System.out.println('@' ^ 'q');

        System.out.println("______________________________");

        System.out.println(true && true);
        System.out.println(false && true);
        System.out.println(false || true);
        System.out.println(true || false);

        int number = 10;
        boolean result = number > 5 && number-- > 5;
        System.out.println(number);
        System.out.println("##################################");

        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();

        System.out.println(number1 == 6 || number2 == 6 || (number1 + number2) % 6 == 0);
    }
}
