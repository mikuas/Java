package com.project.demo.objdemo.extendsdemo.demo1;

public class Manager extends Employee{
    private double bonus;

    public Manager() {

    }

    // 带全部参数的构造
    // 父类 + 子类
    public Manager(String id, String name, double salary, double bonus) {
        super(id, name, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public Manager setBonus(double bonus) {
        this.bonus = bonus;
        return this;
    }

    @Override
    public void work() {
        super.work();
        System.out.println("管理其他人");
    }
}
