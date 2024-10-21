package com.project.demo.arraylistdeom;

public class Phone {
    private int price;
    private String brand;

    public Phone() {

    }

    public Phone(int price, String brand) {
        this.price = price;
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public Phone setPrice(int price) {
        this.price = price;
        return this;
    }

    public String getBrand() {
        return brand;
    }

    public Phone setBrand(String brand) {
        this.brand = brand;
        return this;
    }
}
