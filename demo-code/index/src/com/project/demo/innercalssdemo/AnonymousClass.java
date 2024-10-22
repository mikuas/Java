package com.project.demo.innercalssdemo;

public class AnonymousClass {
    public static void main(String[] args) {

        // 匿名内部类
        new Swim() {

            @Override
            public void swim() {
                System.out.println("重写了swim方法");
            }
        };

    }
}
