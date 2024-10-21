package com.project.testdemo;

public class methodDemo4 {
    public static void main(String[] args) {
        int[] arr = {2, 44, 52, 45, 22, 11, 44, 31, 41};

//        traversalArray(arr);
//        System.out.println(" ");
//        System.out.println(getMax(arr));

//        System.out.println(contains(arr, 22));
        traversalArray(copyOfRange(arr, 2, 6));
    }

    public static void traversalArray(int[] array) {
        for (int j : array) {
            System.out.print(j + " ");
        }
    }

    public static int getMax(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static boolean contains(int[] array, int element) {
        for (int j : array) {
            if (j == element) {
                return true;
            }
        }
        return false;
    }

    public static int[] copyOfRange(int[] array, int from, int to) {
        int[] arr = new int[to - from];
        for (int i = from, j = 0; i < to; i++, j++) {
            arr[j] = array[i];
        }
        return arr;
    }
}

