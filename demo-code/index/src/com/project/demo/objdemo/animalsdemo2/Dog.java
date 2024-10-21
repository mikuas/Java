package com.project.demo.objdemo.animalsdemo2;

public class Dog extends Animals{

    public Dog() {
    }

    public Dog(String color, int age) {
        super(color, age);
    }

    @Override
    public void eat(String something) {
        System.out.println(getAge() + "岁的" + getColor() + "的狗两只前腿死死地抱住" + something + "猛吃");
    }

    public void lookHome() {
        System.out.println("狗在看家");
    }

}
