package com.project.demo;

import java.util.Scanner;

public class getMaxValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number1 = sc.nextInt();
        int number2 = 100;

        int result = number1 > number2 ? 1 : 0;
        System.out.println(result);

        System.out.println("==============================================");

        int weight1 = sc.nextInt();
        int weight2 = sc.nextInt();
        System.out.println(weight1 == weight2 ? "MAX" : "MIN");
    }
}
