package com.project.demo.innercalssdemo;

public class StaticTest {
    public static void main(String[] args) {
        StaticOuter.Inner soi = new StaticOuter.Inner();

        StaticOuter.Inner.show();
        soi.test();
    }
}
