package com.project.demo;

public class traversalArrayDemo {
    public static void main(String[] args) {
        int[] arr = {8, 18, 24, 64, 128};

        // fori
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        int[] array = {1, 2, 3, 4, 5};
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            count += array[i];
        }
        System.out.println(count);

        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 3 == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
