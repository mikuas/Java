package com.project.demo.objdemo.polymorphicdemo;

public class Administrator extends Person{

    @Override
    public void show() {
        System.out.println("Administrator Show");
        System.out.println("Name: " + getName() + " Age: " + getAge());
    }
}
