package com.project.testdemo;

public class test1 {
    public static void main(String[] args) {
        /*
            需求: 给一个整数 x
            如果 x 是一个回文数, 打印true 否则 false    回文数是指正序和倒序读都是一样的整数 例如 121是回文数 123不是
         */
        int number = -12321, value = number, result = 0;
        while (number != 0) {
            int ge = number % 10;
            number /= 10;
            result = result * 10 + ge;
        }
        System.out.println(result);
        System.out.println(result == value);
    }
}
