package com.project.demo.objdemo.dogesdemo;


public class SharPei extends Dog{
    public static void main(String[] args) {
        SharPei sharPei = new SharPei();
        sharPei.eat();
        sharPei.drink();
        sharPei.lookHome();
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("吃骨头");
    }
}
