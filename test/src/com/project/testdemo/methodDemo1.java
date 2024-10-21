package com.project.testdemo;

public class methodDemo1 {
    public static void main(String[] args) {
//        getGirth(14, 21.5);

        System.out.println(getSum(30, 44, 41));

        System.out.println(getSum(44, 51, 41) + getSum(66, 62, 54) + getSum(54, 44, 11) + getSum(55, 5, 2));
    }

    public static void getGirth(double length, double width) {
        System.out.println("周长" + (length + width) * 2 + "CM");
    }

    public static int getSum(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }
}