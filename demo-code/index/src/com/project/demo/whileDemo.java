package com.project.demo;

public class whileDemo {
    public static void main(String[] args) {
        int number = 1;
        while (number <= 10) {
            System.out.println("Hello World");
            number++;
        }

        double height = 8844410;
        double paper = 0.1;
        int count = 0;
        while (paper < height) {
            paper *= 2;
//            paper += paper;
            count++;
        }
        System.out.println(count);
    }
}



