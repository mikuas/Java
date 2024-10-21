package com.project.testdemo;

public class methodDemo2 {
    public static void main(String[] args) {
//        System.out.println(getArea(24, 44) > getArea(33, 66));
        System.out.println(getSum(44, 55));
        System.out.println(getSum(33.4, 44));
    }

    public static double getArea(double length, double width) {
        return length * width;
    }

    public static int getSum(int num1, int num2) {
        return num1 + num2;
    }

    public static int getSum(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    public static double getSum(double num1, double num2) {
        return num1 + num2;
    }
}

