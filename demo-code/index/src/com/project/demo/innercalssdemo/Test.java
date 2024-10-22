package com.project.demo.innercalssdemo;

public class Test {
    public static void main(String[] args) {
//        Outer.Inner oi = new Outer().new Inner();
//
//        oi.setName("张三").setAge(24);
//
//        System.out.println(new Outer().new Inner().gender);

        Outer2.Inner oi = new Outer2().new Inner();

        oi.show();

    }
}



