package com.project.demo.objdemo.animalsdemo2;

public class Test {
    public static void main(String[] args) {

        Animals d = new Dog();
        d.setAge(2).setColor("黑白");
        Person p1 = new Person();
        p1.setAge(30).setName("老王");
        p1.keepPet(d, "骨头");

        System.out.println();

        Animals c = new Cat();
        c.setAge(1).setColor("白");
        Person p2 = new Person();
        p2.setAge(35).setName("老张");
        p2.keepPet(c, "鱼");

    }
}
