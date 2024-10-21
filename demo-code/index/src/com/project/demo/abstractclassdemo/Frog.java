package com.project.demo.abstractclassdemo;

public class Frog extends Animals{

    public Frog() {
    }

    public Frog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat(String food) {
        System.out.println("Frog eats " + food);
    }
}
