package com.project.demo.innerclassdemo;

public class Car {
    private String carName;
    int carAge;
    String carColor;

    public void show() {
        System.out.println(carName);
        System.out.println();
    }

    class Engine {
        String engineName;
        int engineAge;

        public void show() {
            // 内部类可以直接访问外部类的成员,包括私有
            System.out.println(engineAge);
            System.out.println(carName);
        }
    }
}












