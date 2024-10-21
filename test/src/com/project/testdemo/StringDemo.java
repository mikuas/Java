package com.project.testdemo;

import java.util.Scanner;

public class StringDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st1 = sc.next();
        String st2 = new String("abc");
        System.out.println(st1 == st2);
        System.out.println(st1.equals(st2));
    }
}
