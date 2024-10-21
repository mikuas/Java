package com.project.testdemo;

public class StringDemo2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        System.out.println(arrayToString(arr));
    }

    public static String arrayToString(int[] arr) {
        String result = "[";
        if (arr == null) {
            return "";
        } else if (arr.length == 0) {
            return "[]";
        }
        for (int c : arr) {
            if (c == arr[arr.length - 1]) {
                result += c;
            } else {
                result += c + ", ";
            }
        }
        return result + "]";
    }
}
