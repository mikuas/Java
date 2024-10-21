package com.project.demo.interfacedemo4;

public class BasketballAthletes extends Athletes {

    public BasketballAthletes() {
    }

    public BasketballAthletes(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println("篮球运动员在学习打篮球");
    }
}
