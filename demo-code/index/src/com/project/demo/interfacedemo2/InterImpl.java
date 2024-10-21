package com.project.demo.interfacedemo2;

public class InterImpl implements Inter {
    @Override
    public void method() {
        System.out.println("InterImpl method");
    }

    public static void main(String[] args) {
        InterImpl inter = new InterImpl();
        inter.method();
    }
}
