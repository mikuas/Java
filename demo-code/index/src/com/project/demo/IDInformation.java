package com.project.demo;

public class IDInformation {
    public static void main(String[] args) {
        String id = "360882200109154870";
        System.out.println(getDateOfBirth(id));
        System.out.println(getGender(id));
    }

    public static String getDateOfBirth(String ID) {
        return "出身日期: " + ID.substring(6, 10) + "年" + ID.substring(10, 12) + "月" + ID.substring(12, 14) + "日";
    }

    public static String getGender(String ID) {
        if (ID.charAt(16) % 2 == 0) {
            return "性别: 女";
        } else {
            return "性别: 男";
        }
    }
}
