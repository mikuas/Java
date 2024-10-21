package com.project.demo.abstractclassdemo;

public abstract class Animals {
    String name;
    int age;

    public Animals() {
    }

    public Animals(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void eat(String food);

    public void drink() {
        System.out.println("喝水");
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
}
