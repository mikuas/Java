package com.project.demo.interfacedemo1;

public abstract class Animals {
    private String name;
    private int age;

    public Animals() {
    }

    public Animals(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Animals setName(String name) {
        this.name = name;
        return this;
    }

    public int getAge() {
        return age;
    }

    public Animals setAge(int age) {
        this.age = age;
        return this;
    }

    public abstract void eat();
}
