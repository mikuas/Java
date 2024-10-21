package com.project.demo.objdemo.polymorphicdemo;

public class Student extends Person{

    @Override
    public void show() {
        System.out.println("Student Show");
        System.out.println("Name: " + getName() + " Age: " + getAge());
    }
}
