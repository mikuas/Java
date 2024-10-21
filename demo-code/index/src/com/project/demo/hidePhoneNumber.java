package com.project.demo;

public class hidePhoneNumber {
    public static void main(String[] args) {
        String phoneNumber = "145 4124 5612";
        System.out.println(hide(phoneNumber));
    }

    public static String hide(String phoneNumber) {
//        String result = "";
//        for (int i = 0; i < phoneNumber.length(); i++) {
//            if (i > 3 && i < 8) {
//                result += "*";
//            } else {
//                result += phoneNumber.charAt(i);
//            }
//        }
        return phoneNumber.substring(0, 4) + "****" + phoneNumber.substring(8);
    }
}
