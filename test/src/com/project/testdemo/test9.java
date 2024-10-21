package com.project.testdemo;

import java.util.Random;

public class test9 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5}, arrReverse = new int[arr.length];
        for (int i = arr.length - 1, j = 0; j < arr.length; i--, j++) {
            arrReverse[j] = arr[i];
        }
        arr = arrReverse;
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
        for (int j : arr) {
            System.out.print(j + " ");
        }

        System.out.println(" ");

        int[] array = {1, 2, 3, 4, 5};

        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            int temp = array[i];
//            if (i == array.length - 1) break;
//            int index = random.nextInt(i + 1, array.length);
            int index = random.nextInt(array.length);
            array[i] = array[index];
            array[index] = temp;
        }
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
