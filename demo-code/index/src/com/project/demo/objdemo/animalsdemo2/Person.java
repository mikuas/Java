package com.project.demo.objdemo.animalsdemo2;

public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Person setName(String name) {
        this.name = name;
        return this;
    }

    public int getAge() {
        return age;
    }

    public Person setAge(int age) {
        this.age = age;
        return this;
    }

    public void keepPet(Animals a, String something) {
        if (a instanceof Dog d) {
            System.out.println("年龄为" + age + "的" + name + "养了一只" + d.getAge() + "岁的" + d.getColor() + "色的狗");
            d.eat(something);
        } else if (a instanceof Cat c) {
            System.out.println("年龄为" + age + "的" + name + "养了一只" + c.getAge() + "岁的" + c.getColor() + "色的猫");
            c.eat(something);
        } else {
            System.out.println("没有这个物种");
        }
    }
}
