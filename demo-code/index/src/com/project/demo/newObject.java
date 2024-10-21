package com.project.demo;

public class newObject {
    public static void main(String[] args) {

        Phone phone = new Phone();
        phone.brand = "XiaoMi";
        phone.price = 1145;


        System.out.println("品牌: " + phone.brand);
        System.out.println("价格: " + phone.price);

        phone.call();
        phone.playGame();

        System.out.println(phone.getRandom(1, 5));
    }
}
