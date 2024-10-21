package com.project.demo.objdemo.stringcasedemo;

public class StringDemo4 {
    public static void main(String[] args) {
        /*
        给定一个字符串 s,由若干个单词组成,单词前后用空格隔开
        返回单词字符串中最后一个单词的长度

        "Hello World" 输出 5
        "Hello      World           Java" 输出 4
         */

        String str = "Hello World            Java";
        System.out.println(getEnd(str));
    }

    public static String getEnd(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == ' ') {
                break;
            } else {
                result.append(sb.charAt(i));
            }
        }
        return result.reverse().toString();
    }
}
