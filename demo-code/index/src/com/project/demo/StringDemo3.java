package com.project.demo;

import java.util.Scanner;

public class StringDemo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        String result = new StringBuilder(s).reverse().toString();
        System.out.println(result.equals(s) ? "是对称字符串" : "不是对称字符串");

    }

}
