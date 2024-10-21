package com.project.testdemo;

public class Phone {
    private double price;
    private String color, id, name;

    public Phone() {

    }

    public Phone(double price, String color, String id, String name) {
        this.price = price;
        this.color = color;
        this.id = id;
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public Phone setPrice(double price) {
        this.price = price;
        return this;
    }

    public String getColor() {
        return color;
    }

    public Phone setColor(String color) {
        this.color = color;
        return this;
    }

    public String getId() {
        return id;
    }

    public Phone setId(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Phone setName(String name) {
        this.name = name;
        return this;
    }

    public double getPriceAverage(Phone[] arr) {
        double price = 0;
        for (Phone phone : arr) {
            price += phone.getPrice();
        }
        return price / arr.length;
    }
}
