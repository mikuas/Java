package com.project.demo.casedemo;

import com.project.demo.method;

import java.util.Random;

public class qhb {
    public static void main(String[] args) {
        int[] arr = {2, 588, 888, 1000, 10000};
        getArrayElement(arr);
        getCj(arr);
    }

    public static void getArrayElement(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            int temp = array[i], index = random.nextInt(array.length);
            array[i] = array[index];
            array[index] = temp;
        }
    }

    public static void getCj(int[] array) {
        Random random = new Random();
        int[] newArray = new int[array.length];
        for (int i = 0; i < array.length; ) {
            int index = random.nextInt(array.length);
            if (!method.contains(newArray, array[index])) {
                newArray[i] = array[index];
                System.out.println(newArray[i] + "被抽出");
                i++;
            }
        }
    }

//    public static boolean inArray(int[] array, int element) {
//        for (int i : array) {
//            if (i == element){
//                return true;
//            }
//        }
//        return false;
//    }
}
