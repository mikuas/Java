package com.project.testdemo;

import java.util.Scanner;

public class test4 {
    public static void main(String[] args) {
        /*
            需求: 录入一个大于等于2的整数 x, 计算并返回 x 的平方根
            结果只保留整数部分, 小数部分被舍去
         */
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt(), i = 1;
//        for (int i = 1; i <= number; i++) {
//            if (i * i == number) {
//                System.out.println(i);
//                break;
//            }else if (i * i > number) {
//                System.out.println(i - 1);
//                break;
//            }
//        }
        while (i * i < number) {
            i++;
            if (i * i == number) {
                System.out.println(i);
                break;
            }else if (i * i > number) {
                System.out.println(i - 1);
                break;
            }
        }
    }
}
