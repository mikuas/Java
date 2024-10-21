package com.project.demo.interfacedemo1;

public class Rabbit extends Animals{

    public Rabbit() {
    }

    public Rabbit(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("Rabbit eat");
    }
}
