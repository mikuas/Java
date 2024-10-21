package com.project.demo.casedemo;

public class copyArrayElementDemo {
    public static void main(String[] args) {
        /*
            把数组的元素复制到另一个新数组中
         */
        int[] arr = {1, 5, 7, 9, 4, 48, 84, 5, 1, 5, 4};

        for (int i : copyArray(arr)) {
            System.out.print(i + " ");
        }
    }

    public static int[] copyArray(int[] array) {
        int[] newArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        return newArray;
    }
}
