package com.project.demo.abstractclassdemo;

public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("黄狗").setAge(3);

        Frog frog = new Frog();
        frog.setName("绿蛙").setAge(4);

        Sheep sheep = new Sheep();
        sheep.setName("白羊").setAge(5);

        dog.eat("骨头");
        frog.eat("水");
        sheep.eat("草");
    }
}
