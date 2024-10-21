package com.project.testdemo;

import java.util.Random;

public class PhoneTest {
    public static void main(String[] args) {
        Phone[] arr = new Phone[5];
        String[] colorArr = {"Black", "Yellow", "Blue", "Red"};
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            Phone phone = new Phone();
            arr[i] = phone.setId("1145").setName("HUAWEI").setPrice(random.nextDouble(6000)).setColor(colorArr[random.nextInt(colorArr.length)]);
        }

        for (Phone phone : arr) {
            System.out.println(phone.getId());
            System.out.println(phone.getName());
            System.out.println(phone.getPrice());
            System.out.println(phone.getColor());
            System.out.println("---------------------");
        }
        System.out.println(arr[0].getPriceAverage(arr));
    }
}
