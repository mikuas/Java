package com.project.demo.objdemo.stringcasedemo;

public class StringDemo3 {
    public static void main(String[] args) {
        /*
        给定两个字符串形式的非负整数
        返回两个数的乘积, 乘积表示为字符串格式
         */
        System.out.println(getJi(getStringToInt("5"), getStringToInt("10")));
    }
    
    public static int getStringToInt(String str) {
        int[] arr = new int[str.length()];
        int result = 0;
        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i) - '0';
            result = result * 10 +  arr[i];
        }
        return result;
    }

    public static String getJi(int num1, int num2) {
        return num1 * num2 + "";
    }
}
