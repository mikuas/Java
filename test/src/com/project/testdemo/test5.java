package com.project.testdemo;

import java.util.Scanner;

public class test5 {
    public static void main(String[] args) {
        /*
            需求: 录入一个整数 x, 判断改整数是否为一个质数
         */
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
//        while (true) {
//            if (number == 2) {
//                System.out.println(number + "是一个质数");
//                break;
//            } else if (number % 1 == 0 && number % number == 0 && number % 2 != 0) {
//                System.out.println(number + "是一个质数");
//                break;1
//            } else {
//                System.out.println(number + "不是一个质数");
//                break;
//            }
//        }
        boolean flag = true;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println(number + "是一个质数");
        } else {
            System.out.println(number + "不是一个质数");
        }
        /*
            int number = 81
            假设 a * b = 81
            那么 a 和 b 中,其中有一个数必定小于等于9 另一个数大于等于9

            for (int i = 2; i <= number的平方根; i++ {

            }

         */
    }
}
