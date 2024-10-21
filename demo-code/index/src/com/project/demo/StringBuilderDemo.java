package com.project.demo;

public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Hello");
        System.out.println(str);
        str.append(" World");
        System.out.println(str);
        str.reverse();
        System.out.println(str);
        String str1 = "avaJ olleH";
        StringBuilder sb = new StringBuilder(str1);
        System.out.println(sb.reverse());
    }
}
