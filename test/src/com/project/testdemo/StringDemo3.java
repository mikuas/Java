package com.project.testdemo;

import java.util.Scanner;

public class StringDemo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入小于等于九位的数字");
            String str = sc.next();
            if (checkString(str)) {
                System.out.println(getLuoMa(str));
                break;
            } else {
                System.out.println("输入有误");
            }
        }
    }

    public static String getLuoMa(String string) {
        String[] LM = {"-", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            int index = string.charAt(i) - '0';
            result.append(LM[index]).append(" ");
        }
        return result.toString();
    }

    public static boolean checkString(String str) {
        if (str.length() > 9) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) > '9' || str.charAt(i) < '0') {
                return false;
            }
        }
        return true;
    }
}