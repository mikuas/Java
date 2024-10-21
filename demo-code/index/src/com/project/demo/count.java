package com.project.demo;

public class count {
    public static void main(String[] args) {
        // 初始为0
        int count = 0;
        // 上一位
        count++;
        // 上两位,下一位
        count = count + 2;
        count--;

        System.out.println(count);
    }
}
