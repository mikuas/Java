package com.project.demo;

public class StringDemo4 {
    public static void main(String[] args) {
        String strA = "HelloWorld";
        String strB = "lloWorldHe";
        System.out.println(check(strA, strB));
    }

    public static boolean check(String strA, String strB) {
        for (int i = 0; i < strA.length(); i++) {
            strA = moveString(strA);
            if (strA.equals(strB)) {
                return true;
            }
        }
        return false;
    }

    public static String moveString(String str) {
        return str.substring(1) + str.charAt(0);
    }
}
