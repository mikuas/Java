package com.project.demo.objdemo.extendsdemo.demo1;

public class Test {
    public static void main(String[] args) {
        Manager m = new Manager("1145", "zhangsan", 15000, 5000);
        m.work();
        m.eat();

        Cook c = new Cook("1146", "lisi", 10000);
        c.work();
        c.eat();
    }
}
