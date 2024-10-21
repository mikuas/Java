package com.project.demo.objdemo.extendsdemo;

public class Student extends Person{

//    public Student() {
//        super();
//        System.out.println("子类的无参构造");
//    }
//
//    public Student(String name, int age) {
//        super(name, age);
//        System.out.println("子类的无参构造");
//    }
    String name;
    int age;
    String text;

    public Student() {
        // 表示调用本类其他构造方法
        // 虚拟机就不会再添加super()
        this(null, 0, "Hello");
    }

    public Student(String name, int age, String text) {
        this.name = name;
        this.age = age;
        this.text = text;
    }
}





















