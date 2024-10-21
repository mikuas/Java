package com.project.demo.objdemo.animalsdemo1;

public class Animals {

    // 权限修饰符:
    // private: 子类就无法访问, 只能在本类中访问
    public void eat() {
        System.out.println("吃饭");
    }

    public void drink() {
        System.out.println("喝水");
    }
}
