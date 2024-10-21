package com.project.testdemo;

public class reverseStringDemo {
    public static void main(String[] args) {
        String str = "dlroW olleH";
        System.out.println(reverseString(str));
    }

    public static String reverseString(String str) {
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }
        return result;
    }
}
