package com.project.demo.abstractclassdemo;

public class Sheep extends Animals{

    public Sheep() {
    }

    public Sheep(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat(String food) {
        System.out.println("Sheep eats " + food);
    }
}
