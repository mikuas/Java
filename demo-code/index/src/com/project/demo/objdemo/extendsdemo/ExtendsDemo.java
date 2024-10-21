package com.project.demo.objdemo.extendsdemo;

public class ExtendsDemo {
    public static void main(String[] args) {
        Zi zi = new Zi();
        zi.show();
    }
}

class Fu {
    String name = "FU";
    String age = "20";

    public void test() {
        System.out.println("Hello");
    }
}

class Zi extends Fu {
    String name = "ZI";

    public void show() {
        String name = "JuBu";
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);
        System.out.println(age);
    }

    @Override
    public void test() {
        System.out.println("Hello World");
    }
}

