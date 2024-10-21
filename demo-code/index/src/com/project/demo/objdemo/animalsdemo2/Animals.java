package com.project.demo.objdemo.animalsdemo2;

public class Animals {
    private String color;
    private int age;

    public Animals() {
    }

    public Animals(String color, int age) {
        this.color = color;
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public Animals setColor(String color) {
        this.color = color;
        return this;
    }

    public int getAge() {
        return age;
    }

    public Animals setAge(int age) {
        this.age = age;
        return this;
    }

    public void eat(String something) {
    }
}
