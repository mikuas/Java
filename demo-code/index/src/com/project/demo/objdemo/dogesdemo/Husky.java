package com.project.demo.objdemo.dogesdemo;

public class Husky extends Dog{
    public static void main(String[] args) {
        Husky husky = new Husky();
        husky.eat();
        husky.drink();
        husky.lookHome();
        husky.splitHome();
    }

    public void splitHome() {
        System.out.println("拆家");
    }
}
