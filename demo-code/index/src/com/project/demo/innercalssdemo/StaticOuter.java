package com.project.demo.innercalssdemo;

public class StaticOuter {
    int a = 10;
    static int b = 20;

    static class Inner {

        public static void show() {
            System.out.println(b);
        }

        public void test() {
            StaticOuter so = new StaticOuter();
            System.out.println(so.a);
        }
    }
}
