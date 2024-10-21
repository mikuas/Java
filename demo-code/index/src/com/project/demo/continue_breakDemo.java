package com.project.demo;

public class continue_breakDemo {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue; //  跳过本次循环, 继续执行下个循环
            } else if (i == 5) {
                break; // 结束循环
            } else {
                System.out.println(i);
            }
        }
    }
}
