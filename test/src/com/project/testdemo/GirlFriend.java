package com.project.testdemo;

public class GirlFriend {
    private String gender, name;
    private int age;
    private double height;

    public void setAge(int age) {
        if (age >= 18 && age <= 30) {
            this.age = age;
        } else {
            System.out.println("输入数据非法!");
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public double getHeight() {
        return height;
    }

    public void playGame() {
        System.out.println(name + "在van游戏");
    }

    public void eat() {
        System.out.println(name + "在次饭");
    }

    public void sleep() {
        System.out.println(name + "在碎觉");
    }
}
