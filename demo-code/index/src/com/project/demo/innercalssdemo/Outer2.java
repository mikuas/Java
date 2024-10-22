package com.project.demo.innercalssdemo;


public class Outer2 {
    private int a = 10;

    class Inner {
        private int a = 20;
        public void show() {
            int a = 30;
            System.out.println(Outer2.this.a);
            System.out.println(new Outer2().a); // 10
            System.out.println(this.a); // 20
            System.out.println(a); // 30
        }
    }
}



