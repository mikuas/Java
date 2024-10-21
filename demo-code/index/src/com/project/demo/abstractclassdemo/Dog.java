package com.project.demo.abstractclassdemo;

public class Dog extends Animals{

    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat(String food) {
        System.out.println("Dog eats " + food);
    }
}
