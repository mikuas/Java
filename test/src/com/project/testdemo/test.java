package com.project.testdemo;

public class test {
    public static void main(String[] args) {
        String str1 = "String";
        String str2 = str1;

        System.out.println(str1);
        System.out.println(str2);
        str2 = "Hello";
        System.out.println(str1);
        System.out.println(str2);
    }

    public static void change(String string) {
        //
    }
}