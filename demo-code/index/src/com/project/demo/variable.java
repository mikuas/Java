package com.project.demo;

import java.util.Scanner;

public class variable {
    public static void main(String[] args) {
        int a = 114514;
        double b = 11.45;

        System.out.println(a + b);

        int number = 200; // 0000 0000 0000 0000 0000 0000 1100 1000
        byte bit = (byte) number; // 1100 1000 -> 1011 1000(原码)
        System.out.println(bit);


    }

    public static class countString {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入字符: ");
            String str = sc.next();
            countStrings(str);
        }

        public static void countStrings(String str) {
            int bigLetters = 0;
            int smallLetters = 0;
            int number = 0;
            for (int i = 0; i < str.length(); i++) {
                char result = str.charAt(i);
                if (result >= 'A' && result <= 'Z') {
                    bigLetters++;
                } else if (result >= 'a' && result <= 'z') {
                    smallLetters++;
                } else if (result >= '0' && result <= '9') {
                    number++;
                }
            }
            System.out.println("大写字母: " + bigLetters + " 个");
            System.out.println("小写字母: " + smallLetters + " 个");
            System.out.println("数字: " + number + " 个");
        }
    }
}

