package com.project.demo.casedemo;


public class getPrimeNumberDemo {
    public static void main(String[] args) {
        /*
            判断101-200之间有多少个素数,并输出所有素数
            素数（又称质数）是大于1的自然数，且除了1和它本身以外，不能被其他任何自然数整除
            换句话说，素数只能被1和它本身整除。例如，2、3、5、7、11都是素数，而4、6、8、9则不是素数
         */

        int[] arr = new int[100];

        for (int i = 101, j = 0; i <= 200; i++, j++) {
            arr[j] = i;
        }

//        int[] newArr = isPrimeNumber(arr);

//        for (int i : newArr) {
//            System.out.println(i);
//        }
        isPrimeNumber(arr);
    }

    public static void isPrimeNumber(int[] array) {
        int[] newArr = new int[array.length];
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 2; j < array[i]; j++) {
                if (array[i] % j == 0) {
                    newArr[i] = array[i];
                    break;
                }
            }
        }

        for (int i = 0; i < array.length; i++) {
            if (newArr[i] != 0) {
                newArr[i] = 0;
            } else {
                newArr[i] = array[i];
                System.out.print(array[i] + " ");
                count++;
            }
        }
//        int i = 0, j = 0;
//        int[] primeArr = new int[count];
//        while (i < newArr.length) {
//            if (newArr[i] != 0) {
//                primeArr[j] = newArr[i];
//                j++;
//            }
//            i++;
//        }
//        return newArr;
//        return primeArr;
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
