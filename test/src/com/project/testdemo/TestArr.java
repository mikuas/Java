package com.project.testdemo;

public class TestArr {
    private String id, name;
    private double price;
    private int count;

    public TestArr() {

    }

    public TestArr(String id, String name, double price, int count) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public TestArr setCount(int count) {
        this.count = count;
        return this;
    }

    public double getPrice() {
        return price;
    }

    public TestArr setPrice(double price) {
        this.price = price;
        return this;
    }

    public String getName() {
        return name;
    }

    public TestArr setName(String name) {
        this.name = name;
        return this;
    }

    public String getId() {
        return id;
    }

    public TestArr setId(String id) {
        this.id = id;
        return this;
    }
}
