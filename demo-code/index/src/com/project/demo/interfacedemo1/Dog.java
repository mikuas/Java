package com.project.demo.interfacedemo1;

public class Dog extends Animals implements Swim{

    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("Dog eat");
    }

    @Override
    public void swim() {
        System.out.println("Dog swim");
    }
}
