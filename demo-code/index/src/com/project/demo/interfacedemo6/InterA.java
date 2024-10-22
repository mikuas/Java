package com.project.demo.interfacedemo6;

public interface InterA {
    /*// 格式1:
        private 返回值类型 方法名(参数) {}
        private void show() {}

        // 格式2:
        private static 返回值类型 方法名(参数) {}
        private static void method() {}*/

    public default void methodA() {
        System.out.println("methodA");
        Log();
    }

    public static void methodB() {
        System.out.println("methodB");
        Log2();
    }

    private void Log() {
        System.out.println("这里有145行代码");
    }

    private static void Log2() {
        System.out.println("null");
    }
}



