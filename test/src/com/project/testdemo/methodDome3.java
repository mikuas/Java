package com.project.testdemo;

public class methodDome3 {
    public static void main(String[] args) {
        System.out.println(isSame(555555555555L, 127));
    }
    // compare
    public static boolean isSame(byte num1, byte num2) {
        return num1 == num2;
    }

    public static boolean isSame(short num1, short num2) {
        return num1 == num2;
    }

    public static boolean isSame(int num1, int num2) {
        return num1 == num2;
    }

    public static boolean isSame(long num1, long num2) {
        return num1 == num2;
    }
}
