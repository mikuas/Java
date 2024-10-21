package com.project.demo.arraylistdeom;

import java.util.ArrayList;

public class PhoneTestDemo {
    public static void main(String[] args) {
        ArrayList<Phone> list = new ArrayList<>();
        Phone phone = new Phone();
        phone.setBrand("小米").setPrice(1000);
        list.add(phone);
        phone = new Phone();
        phone.setBrand("苹果").setPrice(8000);
        list.add(phone);
        phone = new Phone();
        phone.setBrand("华为").setPrice(2999);
        list.add(phone);

        for (String result : getInfoByPrice(list)) {
            System.out.println(result);
        }
    }

    public static ArrayList<String> getInfoByPrice(ArrayList<Phone> list) {
        ArrayList<String> resultList = new ArrayList<>();
        for (Phone phone : list) {
            if (phone.getPrice() < 3000) {
                resultList.add("Brand: " + phone.getBrand() + ", Price: " + phone.getPrice());
            }
        }
        return resultList;
    }
}
