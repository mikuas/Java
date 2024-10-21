package com.project.demo.interfacedemo5;

public interface Inter {

    public abstract void method();

    public default void show() {
        System.out.println("Hello Interface");
    }
}
