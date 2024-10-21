package com.project.demo.casedemo;

public class test2_2 {
    public static void main(String[] args) {
        /*
            判断101-200之间有多少个素数,并输出所有素数
            素数（又称质数）是大于1的自然数，且除了1和它本身以外，不能被其他任何自然数整除
            换句话说，素数只能被1和它本身整除。例如，2、3、5、7、11都是素数，而4、6、8、9则不是素数
         */

        isPrimeNumber(101, 200);
    }

    public static void isPrimeNumber(int start, int end) {
        for (int i = start; i <= end; i++) {
            boolean flag = true;
            for (int j = 2; j < start; j++){
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.print(i + " ");
            }
        }
    }
}
