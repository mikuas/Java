package com.project.demo.innercalssdemo;

public class PartOuter {
    int age = 18;

    public void partClass() {
        int a = 10;

        final class Part {
            int b = 20;

            public void show() {
                System.out.println(a + b);
                System.out.println("局部内部类");
                System.out.println(age);
            }

            public static void method() {
            }

        }

        Part p = new Part();
        p.show();

        return;
        // 创建局部内部类的对象


    }
}



















